package wrapperclass;

public class Test {
    public static void main(String[] args) {
        String x = "Chathura";       //this work as string class
        int a = 10;                  //primitive data type
        Integer b = Integer.valueOf(20);       //this is a wrapping class of int
        Integer c = 15;               // this is another method for define wrapping class
        Double d = 2.33;
        Boolean e = true;            //wrapping class for bool

        Integer f = null;            //wrapping class can obtain null values

        //primitive data convert to wrapping
        int g = 40;
        Integer h = Integer.valueOf(g);    //boxing, wrapping
        Integer i = g;           //auto boxing, auto wrapping

        //wrapping to primitive
        Integer j = 30;
        int k = j.intValue();           //unboxing, unwrapping
        int l = j;            //auto unboxing, auto unwrapping

    }
}
