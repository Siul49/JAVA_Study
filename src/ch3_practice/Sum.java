package ch3_practice;

public class Sum {
    public static void main(String[] args) {
        int sum = 0, i=1;
        while(i<=50) {
            sum = sum + i;
            i += 3;
        }
        System.out.println(sum);

        sum = 0;
        for(int j=1; j<=50; j+=3) {
            sum = sum + j;
        }
        System.out.println(sum);
    }
}
