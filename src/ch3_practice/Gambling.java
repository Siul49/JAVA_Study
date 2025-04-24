package ch3_practice;

import java.util.Scanner;

public class Gambling {
    public static void main(String[] args){
        System.out.println("***** 갬블링 게임을 시작합니다. *****");
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];


        while(true){
            System.out.print("엔터키 입력>>");
            sc.nextLine();
            for (int i = 0; i < 3; i++) {
                arr[i] = (int)(Math.random() * 100) % 3;
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            if (arr[0] == arr[1] && arr[1] == arr[2]) {
                System.out.println("성공! 대박났어요!");
            }
            else {
                continue;
            }
            System.out.print("계속하시겠습니까?(yes/no)>>");
            String S = sc.nextLine();
            if (S.equals("no")) {
                System.out.println("게임을 종료합니다.");
                break;
            }
            else if(S.equals("yes")){
                continue;
            }
            else{
                break;
            }
        }
    }
}
