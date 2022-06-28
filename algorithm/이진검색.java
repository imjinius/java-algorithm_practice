package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 이진검색 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        br.close();

        int[] a = { 39, 41, 53, 55, 68, 72, 84, 88, 92, 97 };
        int pos, left, right, middle;
        pos = -1;
        left = 0;
        right = a.length - 1;
        System.out.printf("반복 실행 전 : x = %d\n", x);
        System.out.printf("반복 실행 전 : pos = %d, left = %d, middle = ?, right = %d\n", pos, left, right);

        while (pos == -1 && left <= right) {
            middle = (left + right) / 2;
            if (a[middle] == x) {
                pos = middle;
            } else if (a[middle] > x) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
            System.out.printf("반복 실행 중 : pos = %d, left = %d, middle = %d, right = %d\n", pos, left, middle, right);

        }

        System.out.printf("pos = %d\n", pos);

    }
}
