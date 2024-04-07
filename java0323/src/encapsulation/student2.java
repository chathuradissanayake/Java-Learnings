package encapsulation;

public class student2 {
    public static void main(String[] args) {
        student1 obj = new student1();
        obj.setName("Kamal");
        System.out.println(obj.getName());

        obj.setAge(25);
        System.out.println("Age is "+obj.getAge());
    }
}
