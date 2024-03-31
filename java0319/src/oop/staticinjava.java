package oop;

public class staticinjava {
    int x;
    static int y;
    void meth1() {
        //cant use non static
    }
    static void meth2(){
        //only static
    }
    public static void main(String[] args) {
        y = 5;
        meth2();           //these are static

        //how to add nonstatic
        //we need to create an object

        staticinjava obj = new staticinjava();
        obj.x = 2;
        obj.meth1();
    }


}
