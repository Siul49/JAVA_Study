package ch5_practice.eight;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeVendingMachine {
    ArrayList<Box> ingredientBoxes = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    void setIngredientBoxes() {
        ingredientBoxes.add(new IngredientBox("커피", 5));
        ingredientBoxes.add(new IngredientBox("프림", 5));
        ingredientBoxes.add(new IngredientBox("설탕", 5));
    }

    void print(){
        for (Box IB : ingredientBoxes) IB.print();
    }

    boolean lackIngredient(){
        if (ingredientBoxes.get(0).isEmpty()){
            System.out.println("원료가 부족합니다.");
            return true;
        }
        return false;
    }

    public void makeDabangCoffee(){
        if (!lackIngredient()){
            ingredientBoxes.get(0).consume();
            ingredientBoxes.get(1).consume();
            ingredientBoxes.get(2).consume();
        }
        print();
    }

    public void makeSugarCoffee(){
        if (!lackIngredient()){
            ingredientBoxes.get(0).consume();
            ingredientBoxes.get(2).consume();
        }
        print();
    }

    public void makeBlackCoffee(){
        if (!lackIngredient()){
            ingredientBoxes.get(0).consume();
        }
        print();
    }

    void makeCoffee(int coffee){
        if (coffee == 1) makeDabangCoffee();
        if (coffee == 2) makeSugarCoffee();
        if (coffee == 3) makeBlackCoffee();
    }

    void runMachine(){
        System.out.println("*****청춘 커피 자판기 입니다.*****");
        print();
        while(true){
            System.out.print("다방커피:1, 설탕 커피:2, 블랙 커피:3, 종료:4>>");
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 4) {
                System.out.println("청춘 커피 자판기 프로그램을 종료합니다");
                break;
            }
            makeCoffee(choice);
        }
    }

    public static void main(String[] args){
        CoffeeVendingMachine machine = new CoffeeVendingMachine();
        machine.setIngredientBoxes();
        machine.runMachine();
    }
}
