package ch5_practice.fourteen;

public abstract class Shape {
    private Shape next;
    public Shape() {
        next = null;
    }
    public void setNext(Shape obj){next = obj;} // 링크 연결
    public Shape getNext(){return next;}
    public abstract void draw(); // 추상 메소드
}
