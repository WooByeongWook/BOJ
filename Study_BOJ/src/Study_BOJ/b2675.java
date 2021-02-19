package Study_BOJ;

import java.util.Scanner;

public class b2675 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		input.nextLine();
		for(int i = 0; i < testCase; i++) {
			int count = 1;
			int repeat = input.nextInt();
			String s = input.next();
			for(int j = 0; j < s.length(); j++) {
				System.out.print(s.charAt(j));
				if(count/repeat < 1) { 
					j--;
					count++;
				}else count = 1;
			}
			System.out.println();
		}
		input.close();
	}

}
