import java.io.*;
import java.util.ArrayList;
// 적의 위치를 찾는 게임
// 난수를 써야겠다 이거

class game {
    ArrayList<String> locationCells = new ArrayList<>();
    int numOfHits;

    // 이 메소드에서 검증하는 모든 절차를 연습한다.
    public void checkYourself() throws IOException{
        numOfHits = 0;
        int gs = -1;
        while (numOfHits < 3) {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("적을 찾으세요!");
            String guess = s.readLine();
            // 그 입력값을 정수로 바꿔야 해
            gs = Integer.parseInt(guess);

            // 이전에 배열에 넣은 위치를 판별해야해 location에
            if (locationCells.get(gs) != null) {
                numOfHits++;

                if (numOfHits != 3) {
                    locationCells.remove(gs);
                    System.out.println("hit");
                }
            } else {
                System.out.println("miss");
            }
        }
        System.out.println("Good Job");
        System.out.println("you kill " + locationCells.get(gs));
    }
    /*
    public void printLocationCells(){
        for (int i = 0; i < 10; i++){
            System.out.println(locationCells[i]);
        }
    }
    */
    public void setLocationCells() {

        for (int i = 0; i < 10; i++){
            locationCells.add(null);
        }

        int[] ranNum = new int[3];
        for (int i = 0; i < 3; i++){
            ranNum[i] = (int)(Math.random()*9);
        }

        for (int j= 0; j < 3; j++){
            locationCells.add(ranNum[j], "김정은");
        }
    }
}

public class testGame{
    public static void main(String[] args) throws IOException{

        game tg = new game();

        tg.setLocationCells();

        tg.checkYourself();
    }
}