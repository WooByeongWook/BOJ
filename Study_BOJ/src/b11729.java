package Practice_baekjoon;

import java.util.*;

public class b11729 {
	static int n,cnt=0;
	static StringBuilder sb = new StringBuilder();
	static void hanoi(int n,int from,int by,int to) {
		cnt++;
		if(n==1) { // 원판이 1개일 때
			sb.append(from+" "+to+"\n");
			return;
		}else { // 원판이 1개가 아닐 때
			hanoi(n-1,from,to,by); // n-1을 한 후, 1->3->2로 원판을 전달
			sb.append(from+" "+to+"\n");
			hanoi(n-1,by,from,to); // n-1을 한 후, 2->1->3으로 원판을 전달
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
