package Practice_baekjoon;

import java.util.Scanner;

public class b2523 {
 
	public static void main(String[] args) {
 
		Scanner input = new Scanner(System.in);
 
		int N = input.nextInt();
 
		for (int i = 1; i <= N; i++) {	// 1 ~ N
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
 
		for (int i = N - 1; i > 0; i--) {	// N+1 ~ 2N-1
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
 
		input.close();
	}
 
}