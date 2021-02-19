package BJ;

import java.util.Scanner;;

public class b15652 {
    public static int[] a;
    public static StringBuilder sb = new StringBuilder();

    static void func(int start, int index, int n, int m) {
        if (index == m) {
            for (int var: a) {
                sb.append(var).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = start; i <= n; i++) {
            a[index] = i;
            func(i,index+1, n, m);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.close();
        a = new int[m];
        func(1,0, n, m);
        System.out.print(sb);
    }
}

