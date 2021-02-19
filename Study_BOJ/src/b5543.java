package Practice_baekjoon;

import java.util.Scanner;

public class b5543 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sang = input.nextInt();
		int jung = input.nextInt();
		int ha = input.nextInt();
		int coke = input.nextInt();
		int soda = input.nextInt();
		
		int hamburger = sang;
		int beverage = coke;
		
		if(jung <= hamburger && jung <= ha) {
			hamburger = jung;
		}else if(ha <= hamburger && ha <= jung) {
			hamburger = ha;
		}
		
		if(soda < beverage)
			beverage = soda;
		
		System.out.println(hamburger + beverage - 50);
		input.close();
	}

}
