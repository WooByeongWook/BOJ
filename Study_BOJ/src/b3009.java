package Practice_baekjoon;

import java.util.Scanner;

public class b3009 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		int x3 = input.nextInt();
		int y3 = input.nextInt();
		input.close();
		
		int answerX = 0;
		int answerY = 0;
		
		if(x1 == x2)
			answerX = x3;
		else if(x2 == x3)
			answerX = x1;
		else
			answerX = x2;
		
		if(y1 == y2)
			answerY = y3;
		else if(y2 == y3)
			answerY = y1;
		else
			answerY = y2;
		
		System.out.print(answerX + " " + answerY);
	}

}
