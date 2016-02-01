import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by User on 01.02.2016.
 */
public class ScannerTest {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner (new BufferedReader((new FileReader("e:\\in3.txt"))));
        scanner.useLocale(Locale.ENGLISH);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            System.out.println(str);
        }
    }
}
