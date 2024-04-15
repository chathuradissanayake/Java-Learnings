package FileHandling;
//using bufferedwriter
import java.io.BufferedWriter;
import java.io.FileWriter;


public class WriteFile2 {
    public static void main(String[] args)  {
        try{
            BufferedWriter writer2 = new BufferedWriter(new FileWriter("file2.txt", true));
            writer2.write("Hello");
            writer2.newLine();
            writer2.write("Welcome");
            writer2.newLine();
            writer2.append("Chathura");


        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
