package Study_BOJ;

import java.util.Scanner;

public class b1110 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		input.close();
		int a;
		int b = 100;
		int count = 0;
		while(x != b) {
			if(count == 0)
				b = x;
			a = (b/10) + (b%10);
			b = (b%10)*10 + (a%10);
			count++;
		}
		System.out.println(count);

	}

}
