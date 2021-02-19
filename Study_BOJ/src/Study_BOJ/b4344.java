package Study_BOJ;

import java.util.Scanner;

public class b4344 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		
		for(int i = 0; i < count; i++) {
			int n = input.nextInt();
			double check = 0;
			double result = 0;
			int[] arr = new int[n];
			for(int j = 0; j < n; j++) {
				arr[j] = input.nextInt();
				result += arr[j];
			}
			result = result/n;
			for(int j = 0; j < n; j++ ) {
				if(arr[j] > result) check++;
			}
			System.out.println(String.format("%.3f", check/n*100) + "%");
		}
		input.close();

	}

}
