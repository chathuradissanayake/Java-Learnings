package Recursion;

public class recursion2 {
    int i = 0;
    public void display(){
        System.out.println("Hello " +i);
        i++;
        if(i<10){
            display();
        }
    }

    public static void main(String[] args) {
        recursion2 obj2 = new recursion2();
        obj2.display();
    }
}
