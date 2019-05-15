import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileWrite {
    public static void main(String[] args) throws Exception {
        File newFile = new File("C:\\Users\\Petar\\IdeaProjects\\ImportData\\src\\newFile.txt");
        if(newFile.exists()) {
            System.out.println("The file already exists.");
        } else {
            try {
                newFile.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }


            FileWriter fileWrite = new FileWriter(newFile);
            BufferedWriter buffWrite = new BufferedWriter(fileWrite);
            buffWrite.write("This is example of writing things to the text file.");

            buffWrite.close();
            System.out.println("File written!");
        }
    }
}
