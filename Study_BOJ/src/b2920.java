package Practice_baekjoon;

import java.util.Scanner;

public class b2920 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[8];
		for(int i = 0; i < 8; i++) 
			arr[i] = input.nextInt();

		int a = 0;
		int d = 0;
		for(int i = 0; i < 7; i++) {
			if(arr[i+1] == arr[i]+1) { 
				a++;
			}
			else if(arr[i+1] == arr[i]-1) {
				d++;
			}
			else {
				System.out.println("mixed"); 
				break;	
			}
		}
		if(a == 7)
			System.out.println("ascending");
		else if(d == 7) 
			System.out.println("descending");

		input.close();
	}

}
