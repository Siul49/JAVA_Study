package ch4_practice;

import java.util.Scanner;

public class DicApp {
    Scanner sc = new Scanner(System.in);
    String korean;

   void play(){
        System.out.println("한영 단어 검색 프로그램입니다.");

        while(true){
            System.out.print("한글 단어?");
            korean = sc.nextLine();
            if (korean.equals("그만")){
                break;
            }
            String english = Dictionary.kor2Eng(korean);
            if (english == null){
                System.out.println(korean + "은(는) 제 사전에 없습니다.");
                continue;
            }
            System.out.println(korean + "은(는) " + english);
        }
   }
   public static void main(String[] args) {
        DicApp d = new DicApp();
        d.play();
   }
}
