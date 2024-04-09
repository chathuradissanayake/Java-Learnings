package generics;

class A2 {
    void print(Object x){
        Double y = (Double) x;          //typecasting
        System.out.println(y);
    }
}


public class Test3 {
    public static void main(String[] args) {
        A2 obj3 = new A2();
        obj3.print(12.33);
        obj3.print(25);    //we can pass only doubles
    }
}
