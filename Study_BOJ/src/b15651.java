package BJ;

import java.util.Scanner;;

public class b15651 {
    public static int[] a;
    public static StringBuilder sb = new StringBuilder();

    static void func(int index, int n, int m) {
        if (index == m) {
            for (int i = 0; i < m; i++) {
                sb.append(a[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = 1; i <= n; i++) {
                a[index] = i;
                func(index+1, n, m);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.close();
        a = new int[m];
        func(0, n, m);
        System.out.print(sb);
    }
}

