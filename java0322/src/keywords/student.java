package keywords;

public class student {
    String name;
    int age;

    student(String x, int y){
        name = x;
        age = y;
    }

    public static void main(String[] args) {
        student obj1 = new student("Gayan", 23);
        System.out.println(obj1.name);
        System.out.println(obj1.age);
    }
}
