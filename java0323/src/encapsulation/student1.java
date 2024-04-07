package encapsulation;

public class student1 {

    private String name;
    private int age;

    public void setName(String name) {      //public void setName(String x)
        this.name = name;                   //name = x;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age){            //when set method set as private, it can not write
        this.age = age;
    }

    public int getAge() {                   ////when get method set as private, it can not read
        return age;
    }
}
