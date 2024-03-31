package oop;
public class phone {
    String name;
    String color;
    int ram;


    public void call() {
        System.out.println("take a call " +name);
    }
    public void browseinternet() {
        System.out.println("Browse Internet");
    }

    public static void main (String[] args) {
        phone phone1 = new phone();
        phone1.name = "Samsung";
        phone1.color = "Green";
        phone1.call();

        phone phone2 = new phone();
        phone2.name = "Sony";
        phone2.call();

        System.out.println(phone1.color);
    }

}
