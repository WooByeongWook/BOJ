package Study_BOJ;

import java.util.Scanner;

public class b5622 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String in = input.nextLine();
		int time = 0;
		for(int i = 0; i < in.length(); i++) {
			if(in.charAt(i) == 'A' || in.charAt(i) == 'B' || in.charAt(i) == 'C') 
				time += 3;
			else if(in.charAt(i) == 'D' || in.charAt(i) == 'E' || in.charAt(i) == 'F') 
				time += 4;
			else if(in.charAt(i) == 'G' || in.charAt(i) == 'H' || in.charAt(i) == 'I') 
				time += 5;
			else if(in.charAt(i) == 'J' || in.charAt(i) == 'K' || in.charAt(i) == 'L') 
				time += 6;
			else if(in.charAt(i) == 'M' || in.charAt(i) == 'N' || in.charAt(i) == 'O') 
				time += 7;
			else if(in.charAt(i) == 'P' || in.charAt(i) == 'Q' || in.charAt(i) == 'R' || in.charAt(i) == 'S') 
				time += 8;
			else if(in.charAt(i) == 'T' || in.charAt(i) == 'U' || in.charAt(i) == 'V') 
				time += 9;
			else if(in.charAt(i) == 'W' || in.charAt(i) == 'X' || in.charAt(i) == 'Y' || in.charAt(i) == 'Z') 
				time += 10;
		}
		System.out.println(time);
		input.close();
	}

}
