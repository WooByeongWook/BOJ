package Practice_baekjoon;

import java.util.Scanner;;

public class b15649 {
	static boolean[] c = new boolean[10];
	static int[] a = new int[10];

	static void func(int index, int n, int m) {
		if (index == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(a[i]);
				if (i != m - 1)
					System.out.print(' ');
			}
			System.out.println();
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (c[i]) {
				continue;
			}
			c[i] = true;
			a[index] = i;
			func(index + 1, n, m);
			c[i] = false;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		in.close();
		func(0, n, m);
	}
}
