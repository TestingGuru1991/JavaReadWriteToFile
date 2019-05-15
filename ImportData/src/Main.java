import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader file = new FileReader("C:\\Users\\Petar\\IdeaProjects\\ImportData\\src\\readme.txt");
        BufferedReader reader = new BufferedReader(file);

        String text = "";
        String line = reader.readLine();
        while (line != null) {
            text += line;
            line = reader.readLine();
        }
        reader.close();
        System.out.println(text);

    }
}
