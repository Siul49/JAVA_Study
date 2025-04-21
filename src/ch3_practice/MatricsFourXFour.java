package ch3_practice;

public class MatricsFourXFour {
    public static void main(String[] args) {
        int[][] nums = new int[4][4];
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random()*256);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-4d", nums[i][j]);
            }
            System.out.println();
        }
    }
}
