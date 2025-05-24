package ch5_practice.fourteen;

import java.util.ArrayList;
import java.util.Scanner;

public class GraphicEditor {
    private final ArrayList<Shape> shapes = new ArrayList<>();
    boolean off;
    Scanner sc = new Scanner(System.in);

    private void selectOption(){
        System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
        String s = sc.nextLine();
        if (s.equals("1"))  put();
        else if (s.equals("2"))  delete();
        else if (s.equals("3"))  show();
        else if (s.equals("4"))  off = true;
    }

    private void delete(){
        System.out.print("삭제할 도형의 위치>>");
        int s = sc.nextInt();
        if (shapes.size()>=s){
            shapes.remove(s-1);
        }
        else {
            System.out.println("삭제할 수 없습니다.");
        }
        sc.nextLine();
    }

    private void put(){
        System.out.print("Line(1), Rect(2), Circle(3)>>");
        String s = sc.nextLine();
        if (s.equals("1")){  shapes.add(new Line()); }
        else if (s.equals("2")){ shapes.add(new Rect());}
        else if (s.equals("3")){shapes.add(new Circle());}
    }

    public void show(){
        for (Shape s : shapes) s.draw();
    }

    public static void main(String[] args) {
        GraphicEditor g = new GraphicEditor();
        System.out.println("그래픽 에디터 Beauty Graphic Editor를 실행합니다.");

        while(!g.off){
            g.selectOption();
        }

        System.out.println("Beauty Graphic Editor를 종료합니다.");
    }
}
