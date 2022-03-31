import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    private static final Path filepath = Paths.get(System.getProperty("user.dir") + "\\resources\\sample_data.txt");
    public static void main(String[] args) throws IOException {
        String welcome = "Welcome to Files";
        System.out.println(welcome);

        //Create
        System.out.println("\nCalling the create a file method");
        createAFile();

        //Update
        System.out.println("\n Calling the Update Method.");
        writeAFile();

        //Read
        System.out.println("\n Calling the Read Method");
        readAFile();

        //Delete
        System.out.println("\n Calling the Delete Method");
        deleteAFile();
    }

    //Create
    public static void createAFile(){
        try{
            Files.createFile(filepath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Read
    public static void writeAFile(){
        try{
            Files.writeString(filepath,"This is the end my Friend..");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Update
    public static void readAFile(){
        String temp;
        try{
            temp = Files.readString(filepath);
            System.out.println(temp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Delete
//    public static void deleteAFile(){
//        try{
//            Files.delete(filepath);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    //Delete
    public static void deleteAFile() throws IOException {
        Files.delete(filepath);
    }
}
