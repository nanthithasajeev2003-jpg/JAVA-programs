import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();  
        sc.close();

        long sum = 0;  

        
        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0'; 
            sum += digit * digit;          
        }

        System.out.println(sum);
    }
}
