//Given a number N, print the even factors of N.If the even factor does not exists for N print '-1'.


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean found = false;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0 && i % 2 == 0) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("-1");
        }
    }
}
