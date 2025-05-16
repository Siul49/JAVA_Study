package ch5_practice.eight;

class IngredientBox extends Box{
    String name;

    public IngredientBox(String name, int size){
        super(size);
        this.name = name;
    }

    public boolean consume(){
        size--;
        return true;
    }

    public void print(){
        System.out.print(name);
        for (int i = 0; i < size; i++){
            System.out.print("*");
        }
        System.out.println(size);
    }
}
