package ch5_practice.twelve;

public class DictionaryApp {
    public static void main(String[] args){
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "C");
        dic.put("김경수", "자바");
        dic.put("김경수", "C++");
        System.out.println("김경수의 값은 "   + dic.get("김경수")  );
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }
}
