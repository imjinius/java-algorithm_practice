package algorithm;

public class 구구단 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.print(i + "단 : " + "\t");
            for (int j = 1; j < 10; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
