import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        StringBuilder sb = new StringBuilder(S.length());

        for (char c : S.toCharArray()) {
            if (c != ' ') {     // skip spaces
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}
