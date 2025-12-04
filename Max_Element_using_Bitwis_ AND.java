import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int maxVal = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (i == 0 || num > maxVal) {
                maxVal = num;
            }
        }

        System.out.println(maxVal);
    }
}
