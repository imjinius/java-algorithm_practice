
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        String[] data = br.readLine().split("");

        int result = 0;

        for (int i = 0; i < data.length - 1; i++) {
            String alp = data[i] + data[i + 1];
            if (alp.equals("dz") && (i + 2) < data.length)
                alp = data[i] + data[i + 1] + data[i + 2];

            System.out.println("alp:" + alp);

            int there = 0;
            for (int j = 0; j < strArr.length; j++) {
                if (alp.equals(strArr[j])) {
                    result++;
                    i++;
                    there = 1;
                }
            }
            if (there == 0)
                result++;

        }

        System.out.println(result);

    }
}
