package Study_BOJ;

import java.io.IOException;
import java.util.Scanner;

public class b1152 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		input.close();
		String[] sArray = s.split(" ");
		int result = sArray.length;
		for(int i = 0; i < sArray.length; i++) {
			if(sArray[i].length() == 0) result--;	//split���� ������ ���־����� ������ �����̰ų� ó���� �����̳��°�� �ܾ �����Ƿ� ����
		}
		System.out.println(result);
		

	}

}
