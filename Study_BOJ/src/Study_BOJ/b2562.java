package Study_BOJ;

import java.util.Scanner;

public class b2562 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i = 1; i < 10; i++) {
			arr[i] = input.nextInt();
		}
		int max = arr[1];
		int num = 1;
		for(int i = 1 ; i < 10; i++) {
			if(arr[i] > max) {
				max = arr[i];
				num = i;
			}
		}
		System.out.println(max);
		System.out.println(num);

		input.close();
	}

}
