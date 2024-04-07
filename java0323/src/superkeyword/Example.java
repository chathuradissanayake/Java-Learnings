package superkeyword;

class student {
    int age;
    String school;
    String email;
    student(int age, String school, String email){
        this.age = age;
        this.school = school;
        this.email = email;
    }
}
class Kamal extends student{
    int marks;
    Kamal(int age, String school, String email,int marks ){

        super(age, school, email);
        this.marks= marks;
    }
}
public class Example {
    public static void main(String[] args) {
        Kamal obj = new Kamal(15, "BGC","gmail", 76);
        System.out.println(obj.school);
    }
}
