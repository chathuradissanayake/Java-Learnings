package Multithreading;
//synchronizing

class Display {
      //synchronized void print(){               //synchronize => after  finish one thread, then second thread
        void print(){
        Thread t = Thread.currentThread();      //current thread assign to t

        synchronized (this){                       //synchronize for loop
            for (int i=0; i<5;i++){
                try{Thread.sleep(1000);
                    System.out.println(t.getName());  //print thread name
                }
                catch (Exception e){}
            }
        }
    }
}

class T extends Thread{
    Display c;
    T (Display c){
        this.c = c;
    }
    public  void  run(){
        c.print();
    }
}
public class Test4 {
    public static void main(String[] args) {
        Display obj = new Display();

        T thrd1 = new T(obj);
        T thrd2 = new T(obj);

        thrd1.start();
        thrd2.start();
    }
}
