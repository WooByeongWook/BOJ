package Study_BOJ;

import java.util.Scanner;

public class b10809 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		int[] array = new int[26];
		int start = (int)'a';
		int count = 0;
		for(int j = start; j <= (int)'z'; j++) {
			for(int i = 0; i < s.length(); i++) {
				if((int)s.charAt(i) == start) {
					array[count] = i;
					break;
				}
				else array[count] = -1;
			}
			start++;
			count++;
		}
		for(int j = 0; j < array.length; j++)
			System.out.print(array[j] + " ");
		input.close();


	}

}
