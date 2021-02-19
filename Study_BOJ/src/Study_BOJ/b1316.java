package Study_BOJ;

import java.io.IOException;
import java.util.Scanner;

public class b1316 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		boolean check = true; //�׷�ܾ����� �ƴ��� üũ�� boolean ����
		int count = 0; //�׷�ܾ� ������ ������ ����
		int testCase = input.nextInt();	//�ܾ� ����
		input.nextLine();
		String[] s = new String[testCase];	//�ܾ ���� �迭
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
	 * �׷�ܾ����� üũ�� �޼ҵ�
	 */
	public static boolean checkWord(String s) {
		for(int i = 0; i < s.length(); i++) {
			int checkIndex = i;	//���� ������ �ε����� üũ�� ����
			for(int j = i+1; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {	//�������ڿ� �������
					if((checkIndex+1) == j) checkIndex = j;	//���� index�� 1���̳����
					else return false;	//������ index�� 1���̰� �ƴѰ��� �׷�ܾ �ƴϴ�.
				}
			}
		}
		return true;
	}

}
