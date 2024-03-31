package oop;

public class staticinjava2 {
    static String name1;
    static String name2;
    static String name3;
    static void call1(){
        System.out.println("Take a call from " +name1);
    }
    static void call2(){
        System.out.println("Take a call from " +name2);
    }
    static void call3(){
        System.out.println("Take a call from " +name3);
    }

    public static void main(String[] args) {
        name1 = "Huawei";
        name2 = "Nokia";
        name3 = "Sony";
        call2();
        call3();
    }
}
