package objectclass;

class student{
    String name = "Kamal";
    int age = 15;
    void run(){

    }
}
public class test extends student {
    public static void main(String[] args) {
        test obj1 = new test();
        student obj2 = new student();

        obj1.run();

        Object obj3 = new Object();            //parent class for all classes
        Object obj4 = new Object();
        System.out.println(obj3.equals(obj4));
        System.out.println(obj3);

        System.out.println(obj1.hashCode());
        System.out.println(obj1.toString());


    }
}
