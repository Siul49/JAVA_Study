package first_assignment;

import java.util.Scanner;

public class CalculateDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("연산 입력>>");
        double num1 = sc.nextDouble();
        String arithmeticOperators = sc.next();
        double num2 = sc.nextDouble();
        String num2ToString = String.format("%.0f" , num2);

        int stop = 0;
        double result = switch (arithmeticOperators) {
            case "더하기" -> {
                yield num1 + num2;
            }
            case "빼기" -> {
                yield num1 - num2;
            }
            case "곱하기" -> {
                yield num1 * num2;
            }
            case "나누기" -> {
                switch (num2ToString) {
                    case "0" -> {
                        System.out.println("0으로 나눌 수 없습니다.");
                        stop = -1;
                    }
                }
                yield num1 / num2;
            }
            default -> {
                System.out.println("사칙연산이 아닙니다");
                stop  = -1;
                yield 0;
            }
        };

        switch(stop){
            case -1 -> {
            }
            default -> {
                System.out.println(num1 + " "+ arithmeticOperators + " " + num2 +"의 계산결과는 " + result);
            }
        };
    }
}
