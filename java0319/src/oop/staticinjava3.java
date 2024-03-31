package oop;

public class staticinjava3 {
    String name;
    void call(){    //method
        System.out.println("Take a call from "+name);
    }
    //using objects
    public static void main(String[] args) {
        staticinjava3 phone1 = new staticinjava3();
        staticinjava3 phone2 = new staticinjava3();
        staticinjava3 phone3 = new staticinjava3();

        phone1.name = "Nokia";
        phone2.name = "Samsung";
        phone3.name = "Huawei";

        phone2.call();
        phone1.call();
    }
}

//public class staticinjava2 {
//    static String name1;
//    static String name2;
//    static String name3;
//    static void call1(){
//        System.out.println("Take a call from " +name1);
//    }
//    static void call2(){
//        System.out.println("Take a call from " +name2);
//    }
//    static void call3(){
//        System.out.println("Take a call from " +name3);
//    }
//
//    public static void main(String[] args) {
//        name1 = "Huawei";
//        name2 = "Nokia";
//        name3 = "Sony";
//        call2();
//        call3();
//    }
//}


