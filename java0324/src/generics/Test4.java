package generics;

//generics

class A3<Type1> {                    //use generics
    void print(Type1 x){
        Type1 y = (Type1) x;          //typecasting Double y = (Double) x;
        System.out.println(y);
    }
}


public class Test4 {
    public static void main(String[] args) {
        A3 <String> obj3 = new A3();           //String assign to Type1
        obj3.print("Chathura");

        A3 <Integer> obj4 = new A3();           //Integer assign to Type1
        obj4.print(15);
    }
}
