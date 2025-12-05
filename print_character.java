//Given a string S, print the 1st and 3rd character of the string (chracter index starts from 1).



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        
        char first = s.charAt(0);
        char third = s.charAt(2);

        System.out.println("" + first + third);
    }
}
