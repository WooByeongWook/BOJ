package Study_BOJ;

import java.util.*;

public class b11729 {
	static int n,cnt=0;
	static StringBuilder sb = new StringBuilder();
	static void hanoi(int n,int from,int by,int to) {
		cnt++;
		if(n==1) { // ������ 1���� ��
			sb.append(from+" "+to+"\n");
			return;
		}else { // ������ 1���� �ƴ� ��
			hanoi(n-1,from,to,by); // n-1�� �� ��, 1->3->2�� ������ ����
			sb.append(from+" "+to+"\n");
			hanoi(n-1,by,from,to); // n-1�� �� ��, 2->1->3���� ������ ����
		}
	}
	
	public static void main(String[] args)   {
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		input.close();
		hanoi(n,1,2,3);
		System.out.println(cnt);
		System.out.println(sb);
		
	}
	
}
