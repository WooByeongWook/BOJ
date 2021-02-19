package Study_BOJ;

import java.util.Scanner;

public class b2588 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int result = x * y;
		for(int i = 0; i < 3; i++) {
			System.out.println((y%10) * x);
			y /= 10;
			
		}
		System.out.println(result);
		input.close();
	}

}
