import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by User on 01.02.2016.
 */
public class CopyCharacters {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("e:\\in.txt");
        FileWriter fileReader2 = new FileWriter("e:\\out.txt");

        int ch;
        while ((ch = fileReader.read()) != -1) {
            System.out.println(ch);
            fileReader2.write(ch);
        }
        fileReader.close();
        fileReader2.close();
    }
}
