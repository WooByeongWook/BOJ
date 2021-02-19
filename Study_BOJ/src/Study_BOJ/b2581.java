package Study_BOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class b2581 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<>();	//소수들을 담을 어레이리스트
		int start = input.nextInt();
		int end = input.nextInt();
		int sum = 0;
		boolean distinguish = true;
		for(int i = start; i <= end; i++) {
			distinguish = disting(i);
			if(distinguish)
				arrayList.add(i);
		}
		
		if(arrayList.isEmpty())	//비어있다면 소수가 없는 것
			System.out.println("-1");
		else {
			for(int i = 0; i < arrayList.size(); i++) {
				sum += arrayList.get(i);
			}
			System.out.println(sum);
				System.out.println(arrayList.get(0));
		}
		input.close();
	}

	/*
	 * 소수인지 아닌지를 판별하는 메소드
	 */
	public static boolean disting(int a) {
		boolean distinguish = true;	
		if(a==1)	//1은 소수가아니므로 false반환
			return false;
		for(int j = 2; j < a; j++) {
			if(a%j == 0) {
				distinguish = false;
				break;
			}
		}
		return distinguish;
	}
}
