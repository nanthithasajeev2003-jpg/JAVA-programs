//Problem Statement:
//Given a number N, print yes if the number is a multiple of 7 else print no.




import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%7==0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}