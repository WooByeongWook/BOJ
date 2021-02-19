package Study_BOJ;

import java.io.IOException;
import java.util.Scanner;

public class b1193 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		int destination = input.nextInt();
		int startLine = 1;
		int count = 1;
		int denominator = 1; //분모를 나타내는 변수
		int numerator = 1; //분자를 나타내는 변수
		while(true) {
			if(count < destination) {
				startLine++;	//시작하는 분모의 수를 나타낼 변수
				count += startLine;	//지그재그의 범위 개수
			}else {
				break;
			}
		}
		if(startLine % 2 ==0) {	//짝수일때
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
		}else {	//홀수일때
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
