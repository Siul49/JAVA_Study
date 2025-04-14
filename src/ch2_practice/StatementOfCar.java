package ch2_practice;

import java.util.Scanner;

public class StatementOfCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("자동차 상태 입력>>");
        int status = scanner.nextInt();

        if ((status & 0b10000000) == 0) {
            System.out.print("자동차는 정지 상태이고 ");
        } else {
            System.out.print("자동차는 달리는 상태이고 ");
        }

        if ((status & 0b01000000) == 0) {
            System.out.print("에어컨이 꺼진 상태이고 ");
        } else {
            System.out.print("에어컨이 켜진 상태이고 ");
        }

        int temperature = status & 0b00111111;
        System.out.println("온도는 " + temperature + "도이다.");
    }
}
