import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();  
        sc.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!isVowel(ch)) {
                sb.append(ch);
            }
        }

        
        if (sb.length() == 0) {
            System.out.println("-1");
        } else {
            
            System.out.println(sb.reverse().toString());
        }
    }

    
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
