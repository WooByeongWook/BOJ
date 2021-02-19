package Study_BOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class b1427 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num = in.nextLine();
		char[] result = new char[num.length()];
		result = num.toCharArray();
		in.close();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < num.length(); i++) {
			arr.add(Integer.parseInt(Character.toString(result[i])));
		}
		
		Collections.sort(arr);
		
		for(int i = arr.size()-1; i >= 0; i--) {
			System.out.print(arr.get(i));
		}
	}

}
