package superkeyword;


class C {
    void show(){
        System.out.println("Hii");
    }
}
class D extends C{
    void show(){
        super.show();
        System.out.println("Hello");
    }
}

public class supermethod {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();

    }
}
