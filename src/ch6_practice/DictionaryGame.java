package ch6_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DictionaryGame {
    Scanner sc = new Scanner(System.in);
    String answer;
    String st;
    String nowBand;
    int randomNumber;
    List<String> bandGroup = new ArrayList<>(Arrays.asList("브로콜리너마저","유다빈밴드","더발룬티어스"));

    private String randomWord() {
        if (bandGroup.isEmpty()) {
            System.out.println("출제 끝!");
            return null; // 모두 출제했으면 null 반환
        }

        randomNumber = (int)(Math.random() * bandGroup.size());
        nowBand = bandGroup.get(randomNumber);

        // 문제로 쓴 밴드 제거
        bandGroup.remove(randomNumber);

        // 섞는 부분은 동일하게
        StringBuilder s = new StringBuilder(nowBand);
        int randomNum1 = (int)(Math.random() * s.length());
        int randomNum2 = (int)(Math.random() * s.length());
        while(randomNum1 == randomNum2){
            randomNum1 = (int)(Math.random() * s.length());
        }
        char temp = s.charAt(randomNum2);
        s.setCharAt(randomNum2, s.charAt(randomNum1));
        s.setCharAt(randomNum1, temp);
        st = s.toString();
        return s.toString();
    }


    private void play() {
        System.out.println("10초 안에 단어를 맞추세요!!");

        while (true) {
            String question = randomWord();
            if (question == null) {
                System.out.println("더 이상 문제가 없습니다!");
                break;
            }

            System.out.println(question);
            System.out.print(">> ");

            long start = System.currentTimeMillis();
            answer = sc.nextLine();
            long end = System.currentTimeMillis();
            long time = end - start;

            if (answer.equals("그만")) {
                break;
            }

            if (time < 10000) {
                if (nowBand.equals(answer)) {
                    System.out.println("성공!!! " + (time / 1000.0) + "초 경과");
                } else {
                    System.out.println("실패! 정답은 '" + nowBand + "' 였어요. " + (time / 1000.0) + "초 경과");
                }
            } else {
                System.out.println("실패!!! 10초 초과. " + (time / 1000.0) + "초 경과");
            }
        }
    }

    public static void main(String[] args) {
        DictionaryGame d = new DictionaryGame();
        d.play();
    }
}