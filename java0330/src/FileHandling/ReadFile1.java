package FileHandling;
import java.io.File;
import java.util.Scanner;

//by scanner class

public class ReadFile1 {
    public static void main(String[] args) {
        File file = new File("file1.txt");

        try{
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
            reader.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
