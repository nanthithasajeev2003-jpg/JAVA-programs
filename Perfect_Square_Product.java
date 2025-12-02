//Given 2 numbers N,M. Print 'yes' if their product is a perfect square else print 'no'.

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int p=N*M;
		int root=(int)Math.sqrt(p);
		if(root*root==p)
		{
			System.out.print("yes");
		}
		else {
			System.out.print("no");
		}
	}
}