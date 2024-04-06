package keywords;

public class student2 {
    String name;
    int age;

    student2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        student2 obj1 = new student2("Gayan", 23);
        System.out.println(obj1.name);
        System.out.println(obj1.age);
    }
}
