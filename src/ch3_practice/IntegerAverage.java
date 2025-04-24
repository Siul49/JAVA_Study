package ch3_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerAverage {
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        System.out.print("양의 정수를 입력하세요. -1은 입력 끝>>");

        ArrayList<String> arr = new ArrayList<>();
        String s;
        while (true){
            s = sc.next();
            arr.add(s);
            if (s.equals("-1")){
                break;
            }
        }

        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<arr.size();i++){
            try {
                int n = Integer.parseInt(arr.get(i));
                if (n == -1){
                    break;
                }
                if (n <= 0){
                    System.out.println(n +" 제외");
                    continue;
                }
                list.add(n);
                sum += n;
            } catch(NumberFormatException e){
                String t = arr.get(i);
                System.out.println(t+" 제외");
            }
        }

        int avg = sum/list.size();
        System.out.println("평균은 " + avg);
    }
}
