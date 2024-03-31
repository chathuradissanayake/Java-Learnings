package oop;


//constructor has no return type
//method that name is same to class name
public class constructor1 {
    String name;
    constructor1() {
        name = "Kamal";
        System.out.println("Welcome");
    }
    void meth (){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        constructor1 obj = new constructor1();
        System.out.println(obj.name);
    }
}
