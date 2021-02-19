package Practice_baekjoon;

import java.util.Scanner;

public class b4948 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			int start = input.nextInt();
			if(start == 0) break;
			int end = start*2;
			int count = 0;
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

			for(int i = start+1; i <= end; i++) {
				if(num[i])
					count++;
			}
			System.out.println(count);
		}
		input.close();
	}
}
