package Practice_baekjoon;

import java.util.Scanner;

public class b10250 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		for(int i = 0; i < testCase; i++) {
			int H = input.nextInt();	//ȣ�� ����
			int W = input.nextInt();	//ȣ�� �氳��
			int N = input.nextInt();	//�� ��° �մ�
			input.nextLine();
			String result = "";
			if(N%H == 0) {
				result = Integer.toString(H);
				if(((N/H))/10 < 1) 
					result += "0" + Integer.toString(+(N/H));
				else 
					result += Integer.toString((N/H));
			}
			else {
				result = Integer.toString(N%H);
				if(((N/H)+1)/10 < 1) 
					result += "0" + Integer.toString(+(N/H)+1);
				else 
					result += Integer.toString((N/H)+1);
			}
			
			System.out.println(result);
		}
		input.close();
	}

}
