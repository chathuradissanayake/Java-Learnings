package superkeyword;


class A {
    int x = 10;
}
class B extends A{
    int x = 15;
    void print(){
        System.out.println(super.x);     //when add super, shows the parent class value
    }
}

public class superclass {
    public static void main(String[] args) {
        B obj = new B();
        obj.print();

    }
}
