package Study_BOJ;

import java.io.IOException;
import java.util.Scanner;

public class b1316 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		boolean check = true; //그룹단어인지 아닌지 체크할 boolean 변수
		int count = 0; //그룹단어 개수를 저장할 변수
		int testCase = input.nextInt();	//단어 개수
		input.nextLine();
		String[] s = new String[testCase];	//단어를 넣을 배열
		for(int i = 0; i < testCase; i++) {
			s[i] = input.nextLine();
		}
		input.close();

		for(int i = 0; i < testCase; i++) {
			check = checkWord(s[i]);
			if(check) count++;
		}
		
		System.out.println(count);
	}
	
	/*
	 * 그룹단어인지 체크할 메소드
	 */
	public static boolean checkWord(String s) {
		for(int i = 0; i < s.length(); i++) {
			int checkIndex = i;	//같은 문자의 인덱스를 체크할 변수
			for(int j = i+1; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {	//다음문자와 같은경우
					if((checkIndex+1) == j) checkIndex = j;	//같고 index도 1차이날경우
					else return false;	//같지만 index가 1차이가 아닌경우는 그룹단어가 아니다.
				}
			}
		}
		return true;
	}

}
