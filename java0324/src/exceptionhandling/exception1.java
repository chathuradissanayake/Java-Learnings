package exceptionhandling;
import java.util.Scanner;

public class exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 1st Number : ");
        a = sc.nextInt();

        System.out.println("Enter 2nd Number : ");
        b = sc.nextInt();

        try {
            c = a/b;
            System.out.println("Answer is : "+c);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Bye..");



    }
}
