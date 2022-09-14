import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] chess = { 1, 1, 2, 2, 2, 8 };

        String[] s = br.readLine().split(" ");

        for (int i = 0; i < s.length; i++) {
            System.out.print(chess[i] - Integer.parseInt(s[i]));
        }

    }

}
