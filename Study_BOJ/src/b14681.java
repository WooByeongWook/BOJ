package Practice_baekjoon;

import java.util.Scanner;

public class b14681 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		
		if(x>0 && y>0) System.out.println("1");
		else if(x<0 && y>0) System.out.println("2");
		else if(x<0 && y<0) System.out.println("3");
		else if(x>0 && y<0) System.out.println("4");
		input.close();
	}

}
