package ch3_practice;

import java.util.Scanner;

public class SumIsNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.print("양의 정수 10개 입력>>");
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("자리수의 합이 9인 것은 ...");
        for (int i = 0; i < 10; i++) {
            isNine(nums[i]);
        }
    }

    private static void isNine(int num) {
        int sum = 0;
        int tmp = num;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        if (sum == 9) {
            System.out.print(tmp + " ");
        }
    }
}
