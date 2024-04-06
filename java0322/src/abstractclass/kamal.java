package abstractclass;

public class kamal extends nimal{

    void drink(){

    }
    void run(){               //override run method in abstract class
        System.out.println("Running");
    }

    public static void main(String[] args) {
        kamal obj1 = new kamal();
        obj1.drink();
        obj1.eat();      //from abstract class
        obj1.run();
    }
}
