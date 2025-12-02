//Given a string 'S' and a character 'K', find at what position the character 'K' occurs for the first time in 'S'.(Assume the index of string starts at 1).If the character is not found in 'S' then print -1



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char k = sc.next().charAt(0);

        int pos = -1;
        int index = 1;  

        for (char c : s.toCharArray()) {
            if (c == k) {
                pos = index;
                break;
            }
            index++;
        }

        System.out.println(pos);
    }
}
