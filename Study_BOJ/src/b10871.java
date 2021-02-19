package Practice_baekjoon;

import java.util.Scanner;

public class b10871 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int x = input.nextInt();
		
		for(int i = 0; i < n; i++) {
			int a = input.nextInt();
			if(x > a)
				System.out.print(a + " ");
		}
		input.close();
	}

}
