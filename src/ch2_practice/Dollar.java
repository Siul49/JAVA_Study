package ch2_practice;

import java.util.Scanner;

public class Dollar
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dollar;


        System.out.print("$1=1200원입니다. 달러를 입력하세요>>");
        dollar = sc.nextInt();

        System.out.println("$"+dollar+"는 "+(1200*dollar)+"원입니다.");

    }
}
