import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (char c : S.toCharArray()) {
            char shifted = (char)(c + 3);
            if (shifted > 'Z') {
                shifted = (char)(shifted - 26);
            }

            sb.append(shifted);
        }

        System.out.println(sb.toString());
    }
}
