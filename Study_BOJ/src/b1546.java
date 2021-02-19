package Practice_baekjoon;

import java.util.Scanner;

public class b1546 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double result = 0;
		double[] arr = new double[n];
		for(int i = 0; i < n; i++) {
			arr[i] = input.nextDouble();
		}
		double max = arr[0];
		for(int i = 0; i < n; i++) {
			if(max < arr[i]) max = arr[i];
		}
		for(int i = 0; i < n; i++) {
			result += (arr[i]/max)*100;
		}
		System.out.println(result/n);
		input.close();
	}

}
