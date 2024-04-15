package FileHandling;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        File obj = new File("file.txt");  //create a new file in same directory

        try{
            System.out.println(obj.createNewFile());       //return a bool value (can or cant)
            System.out.println(obj.exists());
            System.out.println(obj.getAbsolutePath());      //find the path the obj created on
            System.out.println(obj.getName());          //get the name of the file
            System.out.println(obj.exists());           //is the file exist or not
            System.out.println(obj.canRead());          //can the file read or not
            System.out.println(obj.canWrite());         //can the file write or not
            System.out.println(obj.getAbsoluteFile());
            System.out.println(obj.length());           //content size of the (characters count)

            if( obj.delete()){
                System.out.println("File deleted");
            }
            else {
                System.out.println("No any File!");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
