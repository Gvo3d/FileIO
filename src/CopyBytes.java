import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 01.02.2016.
 */
public class CopyBytes {
    public static void main(String[] args) throws IOException {
        File file = new File("e:\\a.txt");
        File file2 = new File("e:\\b.txt");
        List<Byte> array = new ArrayList();
        array = fileRead(file);
        writeToFile(array, file2);
    }

    private static List fileRead(File file) throws IOException {
        try {
        FileInputStream fileInputStream = new FileInputStream(file);
        int length = (int) file.length();
        List<Byte> result = new ArrayList<>();

            int value;
            int i = 0;
            while ((value = fileInputStream.read()) != -1) {
                result.add((byte) value);
                i++;
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void writeToFile(List<Byte> array, File file)throws IOException{
        try{
            FileOutputStream fileOut = new FileOutputStream(file);
            for (byte b : array) {
                fileOut.write(b);
            }
            fileOut.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}

