
package Multithreading;

class E extends Thread{                //related to 1st method
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println("1st Output");
            try{                        //make a delay
                Thread.sleep(500);
            }
            catch (Exception e){}
        }

    }
}
class F implements Runnable{           //related to 2nd method
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println("2nd Output");
            try{                        //make a delay
                Thread.sleep(500);
            }
            catch (Exception e){}
        }
    }
}

public class Test3 {
    public static void main(String[] args) {

        //1st method by Thread
        E obj = new E();
        obj.start();
        try{                        //add a delay for correctly mixing
            Thread.sleep(50);
        }
        catch (Exception e){}

        //2nd method by Interface
        F obj2 = new F();
        Thread n = new Thread(obj2);
        n.start();

    }
}
