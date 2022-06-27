import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStreamTest1
 */
public class FileInputStreamTest2 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("reader.txt")) {
            int i;
            while((i=fis.read()) != -1) {
                System.out.println((char)i);
            }
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    


}