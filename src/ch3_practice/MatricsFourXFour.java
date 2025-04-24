package ch3_practice;

import java.util.Scanner;

public class MatricsFourXFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nums = new int[4][4];
        System.out.println("4x4 배열에 랜던한 값을 저장한 후 출력합니다.");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random()*256);
                System.out.printf("%-4d", nums[i][j]);
            }
            System.out.println();
        }
        System.out.print("임계값 입력>>");
        int num = input.nextInt();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (nums[i][j] > num) {
                    System.out.printf("%-4d", 255);
                }
                else{
                    System.out.printf("%-4d", 0);
                }
            }
            System.out.println();
        }
    }
}
