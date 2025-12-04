import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : S.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        int uniqueCount = 0;

        for (int count : freq.values()) {
            if (count == 1) {
                uniqueCount++;
            }
        }

        if (uniqueCount == 0) {
            System.out.println("-1");
        } else {
            System.out.println(uniqueCount);
        }
    }
}
