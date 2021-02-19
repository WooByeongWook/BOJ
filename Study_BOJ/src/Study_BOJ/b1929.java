package Study_BOJ;

import java.util.Scanner;

public class b1929 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		boolean[] num = new boolean[end+1];
		num[0] = false;
		num[1] = false;	//0��1�� �Ҽ����ƴϹǷ� ����
		
		for(int i = 2; i < num.length; i++) {	//�迭 �ʱ�ȭ
			num[i] = true;
		}
		
		for(int i=2; i*i<=end; i++) {
            for(int j=i*i; j<=end; j+=i) {
                num[j] = false;        //2�� ������ 2�� ����� false
            }
        }
		
		for(int i = start; i <= end; i++) {
			if(num[i])
				System.out.println(i);
		}
		input.close();
	}
}

