package Study_BOJ;

import java.util.Scanner;

public class b1011 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		for(int i = 0; i < testCase; i++) {
			long x = input.nextLong();	//������ġ�� ������ ����
			long y = input.nextLong();	//��ǥ��ġ�� ������ ����
			int distance = 0;	
			long xCount = 0;	//�۵����Ѽ� �� Ƚ��
			long yCount = 0;	//�ڿ��� ���� Ƚ��
			while(true) {
				distance++;
				
				x += distance;
				xCount++;
				
				if(x >= y) { 
					break;
				}
				
				y -= distance;
				yCount++;
				if(y <= x) {
					break;
				}
				
			}
			System.out.println(xCount+yCount);	
		}
		input.close();
	}
}
