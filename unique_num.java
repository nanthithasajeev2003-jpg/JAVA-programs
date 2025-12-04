import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            result ^= num;   // XOR operation
        }

        System.out.println(result);
    }
}
