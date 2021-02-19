package Practice_baekjoon;

import java.util.*;

public class b2231 {

	static int n; // 입력 받을 변수
	static int sum; // 분해합
	static int constructor; // 생성자

	public static void main(String[] args) throws Exception {

		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		in.close();

		// i를 1부터 n까지 증가시키면서 분해합이 n일 때를 찾는다
		for (int i = 1; i <= n; i++) {
			if (getSum(i) == n) {
				constructor = i;
				break;
			}
		}
		System.out.println(constructor); // 정답 출력
	}

	/*
	 * 분해합을 구하기위한 메소드
	 */
	public static int getSum(int n) {
		String strN = String.valueOf(n);
		int lenOfN = strN.length();
		sum = n;

		for (int i = 0; i < lenOfN; i++) {
			sum += strN.charAt(i) - '0'; // char가 아닌 int로 계산하기 위해  -'0, '0' == 48
		}

		return sum;
	}
}
