package ch4_practice;

public class TV {
    String maker;
    int size, price;


    TV(String maker, int size, int price){
        this.maker = maker;
        this.size = size;
        this.price = price;
    }

    private String getMaker(){
        return maker;
    }

    private int getSize(){
        return size;
    }

    private int getPrice(){
        return price;
    }

    private void show(){
        System.out.println(getMaker() + "에서 만든 " + getPrice() + "만원짜리의 " + getSize() + "인치 TV");
    }

    public static void main(String[] args) {
        TV tv = new TV("Samsung", 50, 300);
        tv.show();
    }
}
