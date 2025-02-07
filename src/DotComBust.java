import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class DotComBust {

    // 사용자의 입력을 을 수 있는 변수 helper
    private GameHelper helper = new GameHelper();

    // DotCom을 보관하는 ArrayList 객체
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();

    // 플레이어의 추측 횟수
    private int numOfGuesses = 0;

    private void setUpGame(){
        // 닷컴 객체 몇 개를 만들고 위치를 지정한다
        DotCom one = new DotCom();
        one.setName("pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");

        dotComsList.add(one);
        dotComsList.add(two );
        dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for( DotCom dotComToSet : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);

            dotComToSet.setLocationCells(newLocation);
        }// for 순환문 끝
    } // setUpgame 메소드 끝

    private void startPlaying(){
        while(!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "miss";
        for (DotCom dotComToTest : dotComsList){
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) {

                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }

        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("All Dot Coms are dead! Your stock is now worthless");
        if (numOfGuesses <= 18){
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank");

        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses");
            System.out.println("Fish are dancing with your options");
        }
    }

    public static void main(String[] args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}


// input을 정해주는 코드
//
class GameHelper{
    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int [] grid = new int [gridSize];
    private int comCount = 0;

    // 플레이어의 인풋을 받는다!!!!!!!!!!!!!!!!!!!!
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.println(prompt + " ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.isEmpty()) {
                return null;
            }
        } catch (IOException e){
            System.out.println("OException: " + e);
        }

        // 문자열의 대문자를 다 소문자로 바꿔줌
        return inputLine.toLowerCase();
    }// 메소드 끝

    public ArrayList<String> placeDotCom(int comSize){
        ArrayList<String> alphaCells = new ArrayList<String>();
        String[] alphacoords = new String [comSize]; // a2같은 좌표가 들어간다
        String temp = null;  // 나중에 연결하기 위한 임시 String 배열 -> 어디에?
        int[] coords = new int[comSize];  // 현재 후보 좌표 -> 무슨 후보좌표야
        int attempt = 0;
        boolean success = false;
        int location = 0;

        comCount++;
        int incr = 1; // 수평방향 증가값
        if((comCount%2) == 1){
            incr = gridLength;
        }

        while(!success & attempt < 200){
            location = (int)(Math.random() * gridSize);
            System.out.println(" try " + location);
            int x = 0;
            success = true;
            while(success & x < comSize){
                if (grid[location] == 0){
                    coords[x++] = location  ;
                    location += incr;
                    if (location >= gridSize){
                        success = false;
                    }
                    if (x > 0 & ((location & gridLength) == 0)){
                        success = false;
                    }
                } else {
                    System.out.println(" used " + location);
                    success = false;
                }
            }
        }// while 끝

        int x = 0;
        int row = 0;
        int column = 0;
        System.out.println("\n");
        while (x < comSize){
            grid[coords[x]] = 1;  // 기본 그리드 좌표를 '사용 중' 으로 표시
            row = (int)(coords[x]/gridLength);
            column = coords[x] % gridLength;
            temp = String.valueOf(alphabet.charAt(column));  // 숫자가 된 열을 문자로 변환

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            System.out.println("    coords  " + x + " = " + alphaCells.get(x-1));
        }
        System.out.println("\n?");
        return alphaCells;
    }
}


// 파괴해야할 닷컴 클래스
class DotCom{
    // 이름도 필요하고
    // 위치도 필요해
    private ArrayList<String> locationCells;
    private String name;

    // locationCells 위치 초기화해주는 메소드
    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    // locationCells 이름을 정해주는 메소드
    public void setName(String n){
        name = n;
    }

    // input값에 따라 miss 또는 kill 또는 hit 문자열를 리턴값으로 보내줌
    public String checkYourself(String userInput){
        String status = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0){
            locationCells.remove(index);
            // ArrayList가 비었을 때 침몰시켰다는 문장을 출력하면서 kill을 리턴하게 해주는 코드
            if (locationCells.isEmpty()){
                status = "kill";
                System.out.println("ouch! You sunk " + name + " :(" );
            }
            else {
                status = "hit";
            }
        }

        return status;
    } // 메소드 끝

}// 클래스 끝