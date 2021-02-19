package Study_BOJ;

import java.util.Scanner;

public class b1978 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		int answer = 0;
		boolean distinguish = true;
		int[] array = new int[count];
		for(int i = 0; i < count; i++) {
			array[i] = input.nextInt();
			for(int j = 2; j < array[i]; j++) {
				if(array[i]%j == 0) {
					distinguish = false;
					break;
				}
			}
			if(distinguish && array[i] != 1)
				answer++;
			else
				distinguish = true;
		}
		System.out.println(answer);
		input.close();
	}

}
