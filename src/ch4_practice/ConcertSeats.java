package ch4_practice;

public class ConcertSeats {
    public static final int CAPACITY = 10;
    public static String[] S = {"---", "---", "---", "---", "---", "---", "---", "---","---", "---"};
    public static String[] A = {"---", "---", "---", "---", "---", "---", "---", "---","---", "---"};
    public static String[] B = {"---", "---", "---", "---", "---", "---", "---", "---","---", "---"};
    public static void show(int seatSection){
        if (seatSection == 1){
            System.out.print("S>> ");
            for (int i = 0; i < CAPACITY; i++){
                System.out.print(S[i] + "  ");
            }
            System.out.println();
        }
        else if (seatSection == 2){
            System.out.print("A>> ");
            for (int i = 0; i < CAPACITY; i++){
                System.out.print(A[i] + "  ");
            }
            System.out.println();
        }
        else if (seatSection == 3){
            System.out.print("B>> ");
            for (int i = 0; i < CAPACITY; i++){
                System.out.print(B[i] + "  ");
            }
            System.out.println();
        }
    }
    public static void showAll(){
        System.out.print("S>> ");
        for (int i = 0; i < CAPACITY; i++){
            System.out.print(S[i] + "  ");
        }
        System.out.println();
        System.out.print("A>> ");
        for (int i = 0; i < CAPACITY; i++){
            System.out.print(A[i] + "  ");
        }
        System.out.println();
        System.out.print("B>> ");
        for (int i = 0; i < CAPACITY; i++){
            System.out.print(B[i] + "  ");
        }
        System.out.println();
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }
}
