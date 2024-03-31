package oop;

//constructor overloading
public class constructor2 {
    int dollers;
    constructor2(){
        dollers = 0;
    }
    constructor2(int x){
        dollers = x;
    }

    public static void main(String [] args){
        constructor2 John = new constructor2();
        constructor2 Smith = new constructor2(1000);

        System.out.println(John.dollers);
        System.out.println(Smith.dollers);
    }
}
