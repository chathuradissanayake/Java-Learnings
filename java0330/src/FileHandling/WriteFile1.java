package FileHandling;
//using filewriter
import java.io.FileWriter;

public class WriteFile1 {
    public static void main(String[] args) {
        String text1 = "Welcome";
        String text2 = " Chathura";
        String text3 = "\n";

        try{
            FileWriter writer = new FileWriter("file1.txt", true);
            writer.write(text1);
            writer.append(text2);
            writer.append(text3);
            writer.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
