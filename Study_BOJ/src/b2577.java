package Practice_baekjoon;

import java.util.Scanner;

public class b2577 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		String result = String.valueOf(a*b*c);
		input.close();
		int count = 0;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < result.length(); j++) {
				if(j == result.length()-1) {
					if(result.substring(j).equals(String.valueOf(i)))
						count++;
				}
				else if(result.substring(j, j+1).equals(String.valueOf(i))){
					count++;	
				}
			}
			System.out.println(count);
			count = 0;
		}

	}

}
