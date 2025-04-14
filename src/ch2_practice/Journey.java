package ch2_practice;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String location;
        int peopleNum, days, flightCost, roomCost;
        int totalCost;
        System.out.print("여행지>>");
        location = sc.nextLine();
        System.out.print("인원수>>");
        peopleNum = sc.nextInt();
        System.out.print("숙박일>>");
        days = sc.nextInt();
        System.out.print("1인당 항공료>>");
        flightCost = sc.nextInt();
        System.out.print("1방 숙박비>>");
        roomCost = sc.nextInt();

        totalCost = (peopleNum+1)/2 * roomCost * days + flightCost*peopleNum;

        System.out.println(peopleNum + "명의 " + location+ " " + days + "박 " + (days+1) +"일 여행에는  방이 " + (peopleNum + 1)/2 + "개 필요하며 경비는 " + totalCost +"원 입니다");
    }
}