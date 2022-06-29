package java_practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        try (InputStreamReader irs = new InputStreamReader(new FileInputStream("reader.txt"))) {
            int i;
            while ((i = irs.read()) != -1) {
                System.out.println((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
