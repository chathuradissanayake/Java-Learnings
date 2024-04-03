package inheritance;

public class NewPhone extends OldPhone {

    void browseinternet(){

    }

    public static void main(String[] args) {
        NewPhone obj2 = new NewPhone();
        obj2.call();
        obj2.message();
    }
}
