import java.util.Scanner;

public class b1436 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		int result = 0;
		
		while(N > 0) {
			result++;
			String s = Integer.toString(result);
			
			if(s.contains("666"))
				N--;
		}
		System.out.println(result);
	}

}
