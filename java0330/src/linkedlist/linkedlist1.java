package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class linkedlist1 {
    public static void main(String[] args) {
        LinkedList arr = new LinkedList();
        arr.add(12);
        System.out.println(arr);

        LinkedList<Integer> arr2 = new LinkedList(List.of(1,2,3));
        System.out.println(arr2);
        arr2.add(15);
        System.out.println(arr2.contains(15));

        System.out.println(arr2.get(2));       //get the value of 2nd index
        System.out.println(arr2.indexOf(2));   //get the index by value

        arr2.forEach(n -> System.out.println(n*10));   //do operations in all elements

        arr2.forEach(n -> {
            System.out.println(n);
            System.out.println(n*5);               //get all elements and print elements one bye one multiplying by 5
        });





    }
}
