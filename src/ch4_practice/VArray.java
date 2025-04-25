package ch4_practice;


public class VArray {
    int[] arr;
    int cap, size;

    VArray(int cap){
        this.cap = cap;
        arr = new int[cap];
        size = 0;
    }

    private int capacity(){
        return cap;
    }
    private int size(){
        return size;
    }

    private void printAll(){
        for (int i = 0; i < size(); i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private void insert(int index, int value) {
        size++;
        if (size() == capacity()+1) {
            cap *= 2;
            int[] arrTemp = new int[capacity()];
            for (int i = 0; i < size(); i++) {
                arrTemp[i] = arr[i];
            }
            arr = arrTemp;
        }
        for (int i = size-1; i >index; i--) {
            arr[i] = arr[i-1];
        }
            arr[index] = value;
    }

    private void add (int value){
        if (size() == capacity()){
            cap *= 2;
            int[] arrTemp = new int[capacity()];
            for (int i = 0; i < size(); i++){
                arrTemp[i] = arr[i];
            }
            arr = arrTemp;
        }
        arr[size++] = value;
    }

    private void remove(int index){
        for (int i = index; i < size() - 1; i++){
            arr[i] = arr[i+1];
        }
        if (index < size()){
            size--;
        }
    }

    public static void main(String[] args) {
        VArray v = new VArray(5);
        System.out.println("용량: " + v.capacity() + ",  저장된 개수: " + v.size());

        for (int i = 0; i < 7; i++)
            v.add(i);
        System.out.println("용량: " + v.capacity() + ",  저장된 개수: " + v.size());
        v.printAll();

        v.insert(3, 100);
        v.insert(5, 200);
        System.out.println("용량: " + v.capacity() + ",  저장된 개수: " + v.size());
        v.printAll();

        v.remove(10);
        System.out.println("용량: " + v.capacity() + ",  저장된 개수: " + v.size());
        v.printAll();

        for (int i = 50; i < 55; i++)
            v.add(i);
        System.out.println("용량: " + v.capacity() + ",  저장된 개수: " + v.size());
        v.printAll();
    }
}
