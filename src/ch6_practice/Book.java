package ch6_practice;

public class Book {
    String title;
    String author;
    String buyer;

    public Book(String author, String title, String buyer) {
        this.title = title;
        this.author = author;
        this.buyer = buyer;
    }

    public String toString(){
        return buyer + " 이 구입한 도서: " + author + "의 " + title;
    }

    public boolean equals(Book a){
        return this.title.equals(a.title);
    }

    public static void main(String[] args) {
        Book a = new Book("김경수", "명품 배드민턴", "박나현");
        Book b = new Book("김경수", "명품 일렉기타", "황환희");

        System.out.println(a);
        System.out.println(b);

        if (a.equals(b)){
            System.out.println("같은 책");
        }
        else {
            System.out.println("다른 책");
        }
    }
}
