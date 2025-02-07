import java.util.ArrayList;

public class AL {
    public static void main(String[] args){
        ArrayList<String> array = new ArrayList<String>();

        array.add("apple");
        array.remove("apple");

        array.add("banana");
        array.add("grape");
        array.add(1, "tomato");

        System.out.print("총 개수는:");
        System.out.println(array.size());

        System.out.print("grape는 어디있어");
        System.out.println(array.indexOf("grape"));

        System.out.println("첫번째 인덱스엔 누가 있어");
        System.out.println(array.get(0));
    }
}
