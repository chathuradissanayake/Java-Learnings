package generics;

class A1 {
    void print(Object x){
        System.out.println(x);
    }
}


public class Test2 {
    public static void main(String[] args) {
        A1 obj1 = new A1();
        obj1.print("Chathura");

        A1 obj2 = new A1();
        obj2.print(25);
    }
}
