package Multithreading;

class A extends Thread{                //related to 1st method
    public void run(){
        System.out.println("1st Output");
    }
}
class B implements Runnable{           //related to 2nd method
    public void run(){
        System.out.println("2nd Output");
    }
}

public class Test1 {
    public static void main(String[] args) {

        //1st method by Thread
        A obj = new A();
        obj.start();

        //2nd method by Interface
        B obj2 = new B();
        Thread n = new Thread(obj2);
        n.start();

    }
}
