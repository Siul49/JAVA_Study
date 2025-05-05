import java.util.*;

public class test{
    public static void main(String[] args) {
        char a1='\u0061'; // 참고로 이거 ‘a’.
        Scanner scanner = new Scanner(System.in);
        String temp=scanner.next();
        char a2 = temp.charAt(0);
        for(int i=a2; i>=a2; i--) {
            for(int j=a1; j<=i; j++)
                System.out.println(j);
            System.out.println();
        } }
}
