import java.io.*;

/**
 * Created by User on 01.02.2016.
 */
public class CopyLines {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader("e:\\in3.txt"));
            writer = new BufferedWriter(new FileWriter("e:\\out3.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.write(line);
                writer.newLine();
                String[] splitted = line.split(" ");
                if (splitted!=null){
                    for (String word: splitted) {
                        writer.write(word);
                        writer.newLine();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
            writer.close();
        }

    }
}
