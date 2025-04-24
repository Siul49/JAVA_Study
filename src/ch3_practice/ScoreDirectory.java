package ch3_practice;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreDirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] key = new int[11];
        int[] score = new int[11];

        for (int i = 1; i < 11; i++){
            System.out.print(i + ">>");
            key[i] = sc.nextInt();
            score[i] = sc.nextInt();
        }


        label:
        while(true){
            System.out.print("학번으로 검색: 1, 점수로 검색: 2, 끝내려면 3>>");
            String s = sc.next();
            switch (s) {
                case "1" -> {
                    while (true) {
                        try {
                            System.out.print("학번>>");
                            int num = sc.nextInt();
                            for (int i = 1; i < 11; i++) {
                                if (num == key[i]) {
                                    System.out.println(score[i] + "점");
                                    break;
                                }
                                if (i == 10 && num != key[i]) {
                                    System.out.println(num + "의 학생은 없습니다.");
                                }
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("경고!! 정수를 입력하세요.");
                            sc.nextLine();
                        }
                    }

                    break;

                } case "2" -> {
                    while(true) {
                        try {
                            System.out.print("점수>>");
                            int num = sc.nextInt();
                            ArrayList<Integer> list = new ArrayList<>();
                            for (int i = 1; i < 11; i++) {
                                if (num == score[i]) {
                                    list.add(key[i]);
                                }
                            }
                            if (list.isEmpty()) {
                                System.out.println("점수가 " + num + "인 학생은 없습니다.");
                                break;
                            }
                            System.out.println("점수가 " + num + "인 학생은 ");
                            for (Integer integer : list) {
                                System.out.print(integer + " ");
                            }
                            System.out.println("입니다.");
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("경고!! 정수를 입력하세요.");
                            sc.nextLine();
                        }
                    }
                    break;
                }
                case "3" -> {
                    System.out.print("프로그램을 종료합니다.");
                    return;
                }
            }
        }
    }
}
