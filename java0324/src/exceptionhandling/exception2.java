package exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;


        try {
            System.out.println("Enter 1st Number : ");
            a = sc.nextInt();

            System.out.println("Enter 2nd Number : ");
            b = sc.nextInt();
            c = a/b;
            System.out.println("Answer is : "+c);
        }
        catch (ArithmeticException e){
            System.out.println("Can not divide by 0");
        }
        catch (InputMismatchException e){
            System.out.println("Please input an integer value");
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Bye..");
        }



    }
}
