package ch4_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ConcertReservationSystem {
    Scanner sc = new Scanner(System.in);
    ArrayList<ConcertCustomer> customers = new ArrayList<>();

    String option;

    int seatSection, seatNumber;
    String name;

    void reservation(int option){
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        seatSection = sc.nextInt();
        ConcertSeats.show(seatSection);
        System.out.print("이름>>");
        name = sc.next();
        System.out.print("번호>>");
        seatNumber = sc.nextInt();
        ConcertCustomer customer = new ConcertCustomer(name,  seatNumber, seatSection);
        customers.add(customer);
        customer.reservationSeats();
        sc.nextLine();
    }

    void show(){
        ConcertSeats.showAll();
    }

    void cancel(){
        System.out.print("이름>>");
        String s = sc.nextLine();

        for (ConcertCustomer c : customers){
            if (c.getName().equals(s)){
                c.cancelSeats();
            }
        }
    }


    private void play(){
        System.out.println("갱수 콘서트홀 예약 시스템입니다.");
        label:
        while(true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            option = sc.nextLine();
            switch (option) {
                case "1"-> reservation(Integer.parseInt(option));
                case "2"-> show();
                case "3" ->  cancel();
                case "4" -> {
                    break label;
                }
            }
        }

    }
    public static void main(String[] args) {
        ConcertReservationSystem crs = new ConcertReservationSystem();
        crs.play();
    }
}
