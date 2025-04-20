package ch3_practice;

import java.util.Scanner;

public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.print("양의 정수 10개 입력>>");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            isMultipleOfThree(arr[i]);
        }

    }

    private static void isMultipleOfThree(int num) {
        if (num % 3 == 0) {
            System.out.print(num + " ");
        }
    }
}
