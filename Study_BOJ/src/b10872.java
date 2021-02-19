package Practice_baekjoon;

import java.util.Scanner;

public class b10872 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		input.close();
		System.out.println(loop(a));

	}
	static int loop(int a) {
		int num = 1;
		for (int i = a; i >= 1; i--) {
			num *= i;
		}
		return num;
	}

}


