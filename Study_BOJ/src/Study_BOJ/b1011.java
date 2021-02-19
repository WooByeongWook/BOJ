package Study_BOJ;

import java.util.Scanner;

public class b1011 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		for(int i = 0; i < testCase; i++) {
			long x = input.nextLong();	//현재위치를 저장할 변수
			long y = input.nextLong();	//목표위치를 저장할 변수
			int distance = 0;	
			long xCount = 0;	//작동시켜서 간 횟수
			long yCount = 0;	//뒤에서 오는 횟수
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
