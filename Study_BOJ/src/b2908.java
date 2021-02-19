package Practice_baekjoon;

import java.util.Scanner;

public class b2908 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sample1 = input.next();
		String sample2 = input.next();
		String reverse1 = revers(sample1);
		String reverse2 = revers(sample2);
		
		if(Integer.parseInt(reverse1) > Integer.parseInt(reverse2)) 
			System.out.println(reverse1);
		else
			System.out.println(reverse2);

		input.close();

	}
	
	//받은 문자열을 역순으로 바꿔주는 메소드
	public static String revers(String s) {
		String result = "";
		for(int i = s.length()-1; i >= 0; i--) {
			result += s.charAt(i);
		}
		return result;
	}

}
