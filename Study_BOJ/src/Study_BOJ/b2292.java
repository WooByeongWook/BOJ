package Study_BOJ;

import java.io.IOException;
import java.util.Scanner;

public class b2292 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		int resultNum = input.nextInt();	//몇번까지 갈지를 입력받을 변수
		int startNum = 1;	//시작하는 숫자
		int count = 1;	//몇칸을 지나는지 저장할 변수
		while(true) {
			if(startNum >= resultNum) break;
			
			startNum = startNum + (6*count);
			count++;	
		}
		System.out.println(count);
		input.close();

	}

}
