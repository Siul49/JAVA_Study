package ch2_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Cordinate{
    public int x, y;
    public Cordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static int[] minCordinate = {10, 10};
    public static  int[] maxCordinate = {200, 300};

    public static void isInsideRectangle (Cordinate cordinate) {
        if (cordinate.x < minCordinate[0] || cordinate.y < minCordinate[1] || cordinate.y > maxCordinate[1] || cordinate.x > maxCordinate[0]) {
            System.out.println("("+cordinate.x+","+cordinate.y+")"+"는 사각형 밖에 있습니다.");
        }
        else if (cordinate.x > minCordinate[0] && cordinate.y > minCordinate[1] && cordinate.y < maxCordinate[1] && cordinate.x < maxCordinate[0]){
            System.out.println("("+cordinate.x+","+cordinate.y+")"+"는 사각형 안에 있습니다.");
        }
        else{
            System.out.println("("+cordinate.x+","+cordinate.y+")"+"는 사각형 선 상에 있습니다.");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점 (x, y)의 좌표 입력>>");
        Cordinate cordinate = new Cordinate(sc.nextInt(), sc.nextInt());
        isInsideRectangle(cordinate);
    }
}
