//Given 2 numbers N,X and an array of N elements, check if there exists any 2 numbers in the array with sum equal to X.If found print 'yes' otherwise print 'no'




import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int X = sc.nextInt();
        
        HashSet<Integer> set = new HashSet<>();
        
        boolean found = false;
        
        for (int i = 0; i < N; i++) {
            int val = sc.nextInt();
            
            if (set.contains(X - val)) {
                found = true;
            }
            
            set.add(val);
        }
        
        System.out.println(found ? "yes" : "no");
    }
}
