package ch2_practice;

import java.util.Scanner;

public class Student {
    String name;
    int lateCount;
    int absentCount;

    int discount;

    Student(String name, int lateCount, int absentCount) {
        this.name = name;
        this.lateCount = lateCount;
        this.absentCount = absentCount;
        this.discount = (lateCount*3 + absentCount*8);
    }

    public String getName() {
        return name;
    }
    public int getLateCount() {
        return lateCount;
    }
    public int getAbsentCount() {
        return absentCount;
    }
    public int getDiscount() {
        return discount;
    }

    static void compareScore(Student s1, Student s2) {
        if (s1.getDiscount() > s2.getDiscount()) {
            System.out.println(s2.getName() + "의 출석 점수가 더 높음. " + s2.getName() +" 출석 점수는 " + (100-s2.getDiscount()));
        }
        else if (s1.getDiscount() < s2.getDiscount()) {
            System.out.println(s1.getName() + "의 출석 점수가 더 높음. " + s1.getName() +" 출석 점수는 " + (100-s1.getDiscount()));
        }
        else {
            System.out.println("점수 동일");
        }
    }

    static void displayDiscount(Student s1, Student s2) {
        System.out.println(s1.getName()+"의 감점은 " + s1.getDiscount() + ", "
                +s2.getName()+"의 감점은 " + s2.getDiscount());
    }

    static Student[] student = new Student[2];
    static void getStudent(Scanner sc) {
        for (int i = 0; i < 2; i++) {
            System.out.print("학생"+(i+1)+">>");
            student[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        getStudent(sc);
        displayDiscount(student[0], student[1]);
        compareScore(student[0], student[1]);
    }
}
