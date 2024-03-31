public class array {
    public static void main(String args[]) {
        int[] num = {1,2,3,4,5};

        String [] names = {"Kamal", "Ajith", "Malith"};
        names [2] = "Pawan";
        System.out.println(names[1]);

        String[] villages = new String[5];
        villages[0]= "Matara";
        villages[4] ="Galle";

        System.out.println(villages[3]);

        int[][] x = {{1,2,3},{3,4,5}};
        System.out.println(x[1][2]); 
//        System.out.println(x[column][row]);

    }
}
