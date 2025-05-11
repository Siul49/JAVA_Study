package ch4_practice;

public class Account {

    Account(int a){

    }

    public static void main(String[] args){
        Account a = new Account(100);
        a.deposit(5000);
        System.out.println("잔금은 " + a.getBalance() + "원입니다.");

        int bulk[] = {100, 500, 200, 700};
        a.deposit(bulk);
        System.out.println("잔금은 " + a.getBalance()  + "원입니다.");

        int money = 1000;
        int wMoney = a.withdraw(money);
        if (wMoney < money)
            System.out.println(wMoney + "원만 인출");
        else
            System.out.println(wMoney + "원 인출");

        System.out.println("잔금은 " + a.getBalance() + "원입니다.");
    }
}
