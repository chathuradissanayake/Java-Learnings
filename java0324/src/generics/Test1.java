package generics;

class A {
    void print(String x){
        System.out.println(x);
    }
}class B {
    void print(int x){
        System.out.println(x);
    }
}

public class Test1 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.print("Chathura");

        B obj2 = new B();
        obj2.print(45);
    }
}
