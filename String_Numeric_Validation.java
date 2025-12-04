import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        boolean isNumeric = true;

        for (char c : S.toCharArray()) {
            if (!Character.isDigit(c)) {
                isNumeric = false;
                break;
            }
        }

        System.out.println(isNumeric ? "yes" : "no");
    }
}
