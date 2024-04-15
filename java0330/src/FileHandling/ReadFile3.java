package FileHandling;

//Buffered reader

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile3 {
    public static void main(String[] args) {
        File file = new File("file1.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String str;
            while ((str = reader.readLine()) != null){
                System.out.println(str);
            }


//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
