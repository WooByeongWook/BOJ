package Practice_baekjoon;

import java.util.Scanner;

public class b10870 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int F = input.nextInt();
		input.close();
		
		System.out.println(fibo(F));
	}
	
	public static int fibo(int F) {
		if(F <= 1)
			return F;
		else
			return fibo(F-2)+ fibo(F-1);
	}

}
