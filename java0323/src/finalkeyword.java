class parent {              //if class set as final, can not extend by child classes  [final class parent{}]
    final public void say(){          //if method set as final it cannot override by child class
        System.out.println("Hiii");
    }
}
class child extends parent{
//    @Override                                 //can not do override
//    public void say() {
//        System.out.println("Hello");
//    }
}


public class finalkeyword {
    public static void main(String[] args) {
        child obj = new child();
        obj.say();
    }
}
