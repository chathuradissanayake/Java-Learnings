package polymorphism;

public class methodoverloading1 {
    public void meth(){
        System.out.println("Method 1");
    }
    public void meth(int x){
        System.out.println("Method 2");
    }
    public void meth(double x){
        System.out.println("Method 3");
    }
    public void meth(int x, int y){
        System.out.println("Method 4");
    }

    public static void main(String[] args) {
        methodoverloading1 obj1 = new methodoverloading1();
        obj1.meth(5.232);

    }


}
