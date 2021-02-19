package Practice_baekjoon;

import java.util.Scanner;

public class b2884 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hour = input.nextInt();
		int min = input.nextInt();
		int total = hour*60 + min;
		int result = total - 45;
		
		if(hour == 0 && min < 45)
			System.out.println("23 " + (60 + result%60));
		else
			System.out.println(result/60 +" "+result%60);
		input.close();

	}

}
