package ch4_practice;

import java.util.ArrayList;

public class Average {
    private ArrayList<Integer> array;

    Average() {
        array = new ArrayList<>();
    }
    private void put(int a) {
        array.add(a);
    }
    private void showAll(){
        System.out.println("***** 저장된 데이터 모두 출력 *****");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i));
            System.out.print(" ");
        }
        System.out.println();
    }

    private double getAvg() {
        double sum = 0;
        for (Integer integer : array) {
            sum += integer;
        }

        return sum / array.size();
    }
    public static void main(String[] args) {
        Average avg = new Average();
        avg.put(10);
        avg.put(15);
        avg.put(100);
        avg.showAll();
        System.out.println("평균은 "+ avg.getAvg());
    }
}
