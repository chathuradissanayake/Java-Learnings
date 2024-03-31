public class strings {
    public static void main(String args[]) {
        //method1
        String s1 = "Kamal";
        System.out.println(s1);

        //method2
        String s2 = new String("Kamal");
        System.out.println(s2);

        //method3
        char[] s3 = {'S', 'U', 'N'};
        String x = new String(s3);
        System.out.println(x);
    }
}
