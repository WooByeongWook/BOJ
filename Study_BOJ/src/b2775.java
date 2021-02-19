package Practice_baekjoon;

import java.util.Scanner;

public class b2775 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		for(int i = 0; i < testCase; i++) {
			int k = input.nextInt();	//몇 층에 사는 지 저장할 변수
			int n = input.nextInt();	//몇 호에 사는지 저장할 변수
			int[] basic = new int[n+1];
			for(int j = 1; j < basic.length; j++) {
				basic[j] = j;
			}
			for(int j = 0; j < k; j++) {
				for(int a = 2; a <= n; a++) {
					basic[a] = basic[a-1] + basic[a];	//층이 증가될수록 basic 배열 초기화
				}
			}
			System.out.println(basic[n]);
		}
		input.close();

	}

}
