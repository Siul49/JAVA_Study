package ch2_practice;

import java.util.Scanner;

public class PrizeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 떡볶이 1인분 2000원, 김말이 1인분 1000원, 쫄면 1인분 3000원
        System.out.println("**** 자바 분식입니다. 주문하면 금액을 알려드립니다. ****");
        System.out.print("떡볶이 몇 인분>>");
        int riceCake = sc.nextInt();
        System.out.print("김말이 몇 인분>>");
        int seaweed = sc.nextInt();
        System.out.print("쫄면 몇 인분>>");
        int noodles = sc.nextInt();

        System.out.println("전체 금액은 " + (riceCake*2000 + seaweed*1000 + noodles*3000) + "원입니다.");
    }
}
