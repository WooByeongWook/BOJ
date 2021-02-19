package Study_BOJ;

import java.io.IOException;
import java.util.Scanner;

public class b1193 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		int destination = input.nextInt();
		int startLine = 1;
		int count = 1;
		int denominator = 1; //�и� ��Ÿ���� ����
		int numerator = 1; //���ڸ� ��Ÿ���� ����
		while(true) {
			if(count < destination) {
				startLine++;	//�����ϴ� �и��� ���� ��Ÿ�� ����
				count += startLine;	//��������� ���� ����
			}else {
				break;
			}
		}
		if(startLine % 2 ==0) {	//¦���϶�
			denominator = startLine;
			numerator = 1;	
			while(true) {
				if(destination == count) break;	
				else {
					numerator++;
					denominator--;
					count--;
				}
			}
		}else {	//Ȧ���϶�
			denominator = 1;
			numerator = startLine;	
			while(true) {
				if(destination == count) break;	
				else {
					numerator--;
					denominator++;
					count--;
				}
			}
		}
		System.out.println( denominator+ "/" + numerator);
		input.close();

	}

}
