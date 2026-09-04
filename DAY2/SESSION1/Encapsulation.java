package DAY2.SESSION1; 

import java.util.Scanner;
class Person{

    private int balance;
    //Getters
    public int getBalance(){
        return balance;

    }
    //Setters
    public void setBalance(int balance){
        this.balance = balance;
    }
}
public class Encapsulation {
    public static void main(string[] args){
        Scanner SC = new Scanner(System.in);
        Person p = new Person();
        p.setBalance(1000);
        System.out.println(p.getBalance());
    }


    
}
