//Given a number N and an array of N integers, print all integers which are divisible by the previous integer.




import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < N; i++) {
            if (arr[i] % arr[i - 1] == 0) {
                sb.append(arr[i]).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}
