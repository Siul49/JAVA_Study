package ch2_practice;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        System.out.print("나이를 입력하세요>>");
        age = sc.nextInt();

        int red = age/10;
        age = age%10;
        int blue = age/5;
        age = age%5;
        int yellow = age;

        int sum = red + blue + yellow;
        System.out.println("빨간 초 " + red + "개, 파란 초 " + blue + "개, 노란 초 " + yellow + "개. 총 " + sum + "개가 필요합니다.");
    }
}
