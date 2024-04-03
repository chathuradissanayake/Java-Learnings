package polymorphism;

public class child extends parent {

    public void phone(){
        System.out.println("Huawei");
    }
    public static void main(String[] args) {
        child obj1 = new child();
        obj1.phone();
    }
}
