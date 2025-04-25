package ch4_practice;

import java.util.Scanner;

public class MonthDiary {
    DayDiary[] days =  new DayDiary[30];
    Scanner input = new Scanner(System.in);
    int year, month;

    MonthDiary(int year, int month){
        this.year = year;
        this.month = month;
        for (int i = 0; i < 30; i++){
            days[i] = new DayDiary();
        }
    }

    private void run(){
        System.out.println("*****  " + year + "년 " + month + "월 다이어리" + "  *****");
        while(true){
            int menu = getMenu();
            if (menu == 1){
                write();
            }
            else if (menu == 2){
                show();
            }
            else if (menu == 3){
                System.out.println("프로그램을 종료합니다.");
                return;
            }
        }

    }
    private void write(){
        System.out.print("날짜(1~30)와 텍스트(빈칸없이 4글자이하)>>");
        // 조건에 맞게 4글자 이하의 입력을 받아야함
        // 조건에 맞게 1~30 사이의 정수를 입력받아야함
        days[input.nextInt()-1].setEvent(input.next());
        input.nextLine();
    }
    private void show(){
        for (int i = 0; i < 30; i++){
            if (days[i].getEvent().equals("...")){
                System.out.printf("%-20s", days[i].getEvent());
            }else{
                System.out.printf("%-8s", days[i].getEvent());
            }

            if (i == 6 || i == 13 || i == 20 || i == 27){
                System.out.println();
            }
        }
        System.out.println();
    }
    private int getMenu(){
        System.out.print("기록:1, 보기:2, 종료:3>>");
        int choice = input.nextInt();
        input.nextLine();
        return choice;
    }


    public static void main(String[] args) {
        MonthDiary diary = new MonthDiary(2024, 10);
        diary.run();
    }
}
