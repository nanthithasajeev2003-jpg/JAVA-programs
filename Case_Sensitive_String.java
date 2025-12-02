//Given 2 strings S1 and s2, check whether they are case senitively equal without using any predefined function(case sensitive).If they are not same print 'no'




import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int i = 0;
        boolean Same = true;
        int len1 = 0, len2 = 0;
         for (char c : s1.toCharArray()) len1++;
         for (char c : s2.toCharArray()) len2++;
          if (len1 != len2) {
              Same = false;
        }
        else {
              while (i < len1) {
                if (s1.charAt(i) != s2.charAt(i)) {
                      Same = false;
                    break;
                }
                i++;
              }
        }
         if (Same)
            System.out.println("yes");
        else
            System.out.println("no");
        
    }
}