package ch6_practice;

import java.util.Scanner;

public class SpiningString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 됩니다.");
        String s = sc.nextLine();

        for (int i = 1; i <= s.length(); i++) {
            System.out.print(s.substring(i));
            System.out.println(s.substring(0, i));
        }
    }



}
