import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int val = sc.nextInt();
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == K) {
                result.add(entry.getKey());
            }
        }

        if (result.isEmpty()) {
            System.out.println("-1");
            return;
        }

        Collections.sort(result);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1) System.out.print(" ");
        }
    }
}
