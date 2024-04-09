package generics;


public class Test5 <Type2>{
    Type2[] arr = (Type2[]) new Object();

    public static void main(String[] args) {
        Test5 obj = new Test5();
        obj.arr[0] = 32;
        obj.arr[1] = "Hello";


    }
}

//public class Test5 {
//    public static void main(String[] args) {
//        Object arr[] = new Object[3];
//
//        arr[0] = 23;
//        arr[1] = 11;
//        arr[2] = "hello";
//
//        int number;
//        for(int i=0; i<3; i++){
//
//            number = arr[i];
//            System.out.println();
//        }
//    }
//}


