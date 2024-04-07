package interfacejava;

public class kamal implements student{
    @Override
    public void eat() {
        System.out.println("Eating");
    }
    @Override
    public void drink() {
        System.out.println("Drinking");
    }
    @Override
    public void run() {
        System.out.println("Running");
    }

    public static void main(String[] args) {
        student obj = new kamal();
        System.out.println(student.number);
        obj.run();
        obj.eat();
    }
}
