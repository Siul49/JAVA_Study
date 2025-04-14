package ch2_practice;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("생일을 입력 하세요>>");
        int birthday = sc.nextInt();
        int year, month, day;
        year = birthday / 10000;
        month = (birthday % 10000) / 100;
        day = birthday % 100;

       /*if (!ValidateBirthday(birthday, year, month, day)){
            System.out.println("잘못된 형식입니다!");
            return;
        }*/
        System.out.println(year +"년 " + month + "월 " + day + "일");
    }
    /*public static boolean ValidateBirthday(int birthday, int year, int month, int day) {
        if (birthday > 20250408){
            return false;
        }
        else if (year > 2025 || year < 1900) {
            return false;
        }
        else if (month > 12 || month < 1 ) {
            return false;
        }
        // 날짜 계산 결과
        else {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    if (day > 31 || day < 0) {
                        return false;
                    }
                    break;
                case 4, 6, 9, 11:
                    if (day > 30 || day < 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (LeapYear(year)) {
                        if (day > 29 || day < 0) {
                            return false;
                        }
                        break;
                    } else {
                        if (day > 28 || day < 0) {
                            return false;
                        }
                    }
            };
        }
        return true;
    }

    public static boolean LeapYear(int year) {
        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        else if (((year % 4) == 0) || ((year % 400) == 0)) {
            return true;
        } else {
            return false;
        }
    }*/
}
