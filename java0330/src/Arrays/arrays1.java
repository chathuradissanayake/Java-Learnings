package Arrays;

import java.util.ArrayList;

public class arrays1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList(10);
        arr.add(5);
        arr.add(30);
        System.out.println(arr);
        arr.add(0,99);
        System.out.println(arr);

        arr.set(2,55);           //reset values of index
        System.out.println(arr);
        System.out.println(arr.contains(55));

        //System.out.println(arr[2]);  we cannot get elements by this method
        System.out.println(arr.get(2));
        System.out.println(arr.indexOf(55));   //show the 1st index

        System.out.println(arr.size());

        for(int i =0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }

        for (Integer x:arr){            //another method for get elements in array
            System.out.println(x);
        }

        arr.forEach(x -> System.out.println(x));

        arr.clear();
        System.out.println(arr);



    }
}
