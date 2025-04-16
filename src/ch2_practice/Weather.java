package ch2_practice;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월을 입력하세요(1~12)>>");
        int whatMonth = sc.nextInt();

        switch (whatMonth) {
            case 12, 1, 2 : {
                System.out.println("눈 내리는 하얀 겨울");
                break;
            }
            case 3, 4, 5 : {
                System.out.println("따뜻한 봄");
                break;
            }
            case 6, 7, 8 : {
                System.out.println("바다가 즐거운 여름");
                break;
            }
            case 9, 10, 11 : {
                System.out.println("낙엽이 지는 아름다운 가을");
                break;
            }
            default : {
                System.out.println("1~12만 입력하세요");
            }
        }

    }
}
