package Study_BOJ;

import java.util.Scanner;

public class b10950 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		for(int i = 0; i < count; i++) {
			int x = input.nextInt();
			int y = input.nextInt();
			System.out.println(x+y);
		}
		input.close();

	}

}
