package ch4_practice;

import java.util.Arrays;

class ArrayUtil {
    public static int[] concat(int[] a, int[] b){
        /* 배열 a와 b를 연결한 새로운 배열 리턴 */
        int[] arr = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++){
            arr[i] = a[i];
        }
        for (int i = a.length; i < arr.length; i++){
            arr[i] = b[i-a.length];
        }
        return arr;
    }
    public static void print(int[] a) {
        /*배열 a 출력*/
        System.out.println(Arrays.toString(a));
    }
}

public class StaticEx{
    public static void main(String[] arg){
        int[] array1 = { 1,5,7,9 };
        int[] array2 = { 3, 6, -1, 100, 77 };
        int[] array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}