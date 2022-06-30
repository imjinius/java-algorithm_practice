package java_practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {
    public static void main(String[] args) {
        long millisecond = 0;
        try (FileInputStream fis = new FileInputStream("a.zip");
                FileOutputStream fos = new FileOutputStream("copy.zip");
                BufferedInputStream bis = new BufferedInputStream(fis);
                BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            millisecond = System.currentTimeMillis(); // 파일 복사를 시작하기 전 시간
            int i;
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }
            millisecond = System.currentTimeMillis() - millisecond; // 파일을 복사하는 데 걸리는 시간 계산

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("파일 복사하는데" + millisecond + "millisecond 소요되었습니다.");

    }
}