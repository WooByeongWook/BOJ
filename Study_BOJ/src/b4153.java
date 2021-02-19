package Practice_baekjoon;

import java.util.Scanner;

public class b4153 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			int a = input.nextInt();
			int b = input.nextInt(); 
			int c = input.nextInt();
			
			if(a == 0 && b == 0 && c == 0)
				break;
			
			if(a*a + b*b == c*c)
				System.out.println("right");
			else if(c*c + a*a == b*b)
				System.out.println("right");
			else if(c*c + b*b == a*a)
				System.out.println("right");
			else
				System.out.println("wrong");
		}
		input.close();
	}

}
