package oop;

public class staticinjava4 {

    //value pass for method
    void call(String name){    //method
        System.out.println("Take a call from "+name);
    }
    //using objects
    public static void main(String[] args) {
        staticinjava4 phone1 = new staticinjava4();
        staticinjava4 phone2 = new staticinjava4();
        staticinjava4 phone3 = new staticinjava4();

        phone2.call("Nokia");
        phone1.call("Huawei");
    }
}

//public class staticinjava3 {
//    String name;
//    void call(){    //method
//        System.out.println("Take a call from "+name);
//    }
//    //using objects
//    public static void main(String[] args) {
//        staticinjava3 phone1 = new staticinjava3();
//        staticinjava3 phone2 = new staticinjava3();
//        staticinjava3 phone3 = new staticinjava3();
//
//        phone1.name = "Nokia";
//        phone2.name = "Samsung";
//        phone3.name = "Huawei";
//
//        phone2.call();
//        phone1.call();
//    }
//}
