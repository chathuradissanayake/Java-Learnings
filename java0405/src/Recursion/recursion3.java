package Recursion;

public class recursion3 {
    public int factorial(int n){
        if(n==0){
            return 1;
        }
        else {
            return n  * factorial(n - 1);
        }

    }

    public static void main(String[] args) {
        int y = 5;
        recursion3 obj3 = new recursion3();
        int result = obj3.factorial(y);
        System.out.println(result);
    }
}
