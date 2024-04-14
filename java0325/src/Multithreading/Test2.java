
package Multithreading;

class C extends Thread{                //related to 1st method
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println("1st Output");
        }

    }
}
class D implements Runnable{           //related to 2nd method
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println("2nd Output");
        }
    }
}

public class Test2 {
    public static void main(String[] args) {

        //1st method by Thread
        C obj = new C();
        obj.start();

        //2nd method by Interface
        D obj2 = new D();
        Thread n = new Thread(obj2);
        n.start();

    }
}
