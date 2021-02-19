package Study_BOJ;

import java.util.Scanner;

public class b1330 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		if(x>y) System.out.println(">");
		else if(x<y) System.out.println("<");
		else System.out.println("==");

		input.close();
	}

}
