package Study_BOJ;

import java.io.IOException;
import java.util.Scanner;

public class b2292 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		int resultNum = input.nextInt();	//������� ������ �Է¹��� ����
		int startNum = 1;	//�����ϴ� ����
		int count = 1;	//��ĭ�� �������� ������ ����
		while(true) {
			if(startNum >= resultNum) break;
			
			startNum = startNum + (6*count);
			count++;	
		}
		System.out.println(count);
		input.close();

	}

}
