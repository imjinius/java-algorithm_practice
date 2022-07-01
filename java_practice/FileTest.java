package java_practice;

import java.io.File;
import java.io.IOException;
import java.security.spec.DSAPublicKeySpec;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\easypub\\newFile.txt");
        file.createNewFile();

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        file.delete();
    }
}
