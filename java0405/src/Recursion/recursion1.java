package Recursion;

public class recursion1 {

    public void display(){
        System.out.println("Hello");
        display();
    }

    public static void main(String[] args) {
        recursion1 obj1 = new recursion1();
        obj1.display();
    }
}
