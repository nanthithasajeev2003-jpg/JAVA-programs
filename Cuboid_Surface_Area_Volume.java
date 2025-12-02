//Write a program to calculate the total surface area and volume of cuboid.


import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		int B=sc.nextInt();
		int H=sc.nextInt();
		int SA=2*(L*B+B*H+H*L);
		int vol=L*B*H;
		System.out.print(SA +" "+ vol);
	}
}