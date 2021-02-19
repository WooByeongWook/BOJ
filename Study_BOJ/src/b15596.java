import java.util.Scanner;

public class b15596 {

	public static long sum(int[] a) {
		long ans = 0;
		for(int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		System.out.println(sum(a));
		input.close();

	}

}
