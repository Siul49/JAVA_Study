package ch5_practice.eight;

import java.util.ArrayList;
import java.util.Scanner;

class IngredientBox extends Box{
    String name;

    public IngredientBox(String name, int size){
        super.size = size;
        this.name = name;
    }

    private void notEnough(){
        if (isEmpty()){
            System.out.println("원료가 부족합니다.");
        }
    }

    public boolean consume(){



    }

    public void print(){
        for (int i = 0; i < size; i++){
            System.out.print("*");
        }
        System.out.println(size);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<Box> boxes = new ArrayList<>();
        boxes.add(new IngredientBox("커피", 5));
        boxes.add(new IngredientBox("프림", 5));
        boxes.add(new IngredientBox("설탕", 5));

        System.out.println("*****청춘 커피 자판기 입니다.*****");
        for (Box box : boxes){
            box.print();
        }


        while(true){
            System.out.println("다방커피:1, 설탕 커피:2, 블랙 커피:3, 종료:4>>1");
            int choice = input.nextInt();
            if (choice == 1){
                for (Box box : boxes){
                    box.size--;
                    box.print();
                }
            }
            else if (choice == 2){
                for (Box box : boxes){
                    box.size--;
                    box.print();
                }
            }
            else if (choice == 3){
                for (Box box : boxes){
                    if (box.name == )
                    box.size--;
                    box.print();
                }
            }
            else if (choice == 4){
                System.out.println("청춘 커피 자판기 프로그램을 종료합니다");
                break;
            }
        }

    }
}
