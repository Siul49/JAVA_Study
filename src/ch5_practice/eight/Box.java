package ch5_practice.eight;

abstract class Box {
    protected int size;
    public Box(int size){
        this.size = size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public abstract boolean consume();
    public abstract void print();

}
