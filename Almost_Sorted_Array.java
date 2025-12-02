//Given a number N followed by N elements which can be arranged in ascending order with maximum one element update. Print the index of the element which has to be changed else print '-1' if the updation not neccassary or if the given input needs more than one update to form ascending order.

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int index = -1;
		int count = 0;

		for (int i = 0; i < N - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				count++;

				if (count > 1) {
					System.out.println("-1");
					return;
				}

				index = i;
			}
		}
		if (count == 0) {
			System.out.println("-1");
			return;
		}
		System.out.println(index);
	}
}
