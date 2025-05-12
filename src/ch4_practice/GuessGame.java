package ch4_practice;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    Player[] players;
    int randomNumber;
    static Scanner sc = new Scanner(System.in);
    String ctn = "yes";

    GuessGame(int n){
        players = new Player[n];
        for(int i = 0; i < n; i++){
            players[i] = new Player();
        }
        randomNumber = new Random().nextInt(100);
    }

    private void guess(){
        System.out.println("1~100사이의 숫자가 결정되었습니다. 선수들은 맞추어 보세요.");

        for (Player p : players){
            System.out.print(p.getName() + ">>");
            p.setGuess(sc.nextInt());
        }
        sc.nextLine();
        winner(players);
    }

    private void winner(Player[] p){
        Player winner = p[0];
        for(Player p1 : p){
            if (Math.abs(p1.getGuess()-randomNumber) <= Math.abs(randomNumber - winner.getGuess())){
                winner = p1;
            }
        }
        winner.earnScore();
        System.out.println("정답은 " + randomNumber + ". " + winner.getName() + "이 이겼습니다. " + "승점 1점 확보!");
    }

    void getFinalWinner(Player[] p){
        Player winner = p[0];
        for (Player p1 : p){
            System.out.print(p1.getName() + ":" + p1.getScore() + " ");
            if (p1.getScore() > winner.getScore()){
                winner = p1;
            }
        }
        System.out.println(winner.getName() + "이 최종 승리하였습니다.");
    }
    private void play(){
        while(true){
            guess();
            System.out.print("계속하려면 yes 입력>>");
            String s = sc.nextLine();
            if(!ctn.equals(s)){
                break;
            }
        }
        getFinalWinner(players);
    }

    public static void main(String[] args) {
        System.out.println("*** 예측 게임을 시작합니다. ***");
        System.out.print("게임에 참가할 선수 수>>");
        int playerNum = sc.nextInt();
        GuessGame g = new GuessGame(playerNum);
        g.play();
    }
}


class Player{
    private String name;
    private int score;
    private int guess;
    Scanner sc = new Scanner(System.in);

    Player(){
        System.out.print("선수 이름>>");
        name = sc.nextLine();
        score = 0;
    }

    String getName(){
        return name;
    }

    void earnScore(){
        this.score += 1;
    }

    int getScore(){
        return score;
    }

    int getGuess(){
        return guess;
    }
    void setGuess(int guess){
        this.guess = guess;
    }
}
