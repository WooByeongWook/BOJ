import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class b11651 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] arr = new int[N][2];

		for(int i = 0; i < N; i++) {
			arr[i][0] = in.nextInt();
			arr[i][1] = in.nextInt();

		}
		in.close();
		Arrays.sort(arr , new Comparator<int[]>() {	//Comparator사용
			@Override
			public int compare(int[] o1, int[] o2) {	//두개를 받아 같으면 0번방을 비교 다르면 1번방으로 비교
				// TODO Auto-generated method stub
				if(o1[1]==o2[1]) return Integer.compare(o1[0], o2[0]);
				return Integer.compare(o1[1], o2[1]);
			}
			
		});
		
		for(int i=0; i<N; i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
				
	}

}

