package Study_BOJ;

import java.util.Scanner;

public class b9663 {
    public static int[] arr;
    public static int N;
    public static int count = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        input.close();
        arr = new int[N];
        n_Queen(0);
        System.out.println(count);
    }

    public static void n_Queen(int dep) {
        if(dep == N){
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[dep] = i;
            if(check(dep)){
                n_Queen(dep+1);
            }

        }
    }

    public static boolean check(int a){
        for (int i = 0; i < a; i++) {
            if (arr[a] == arr[i]) {
                return false;
            }
            //대각선 판별은 구글링해서 참고함.
            else if (Math.abs(a - i) == Math.abs(arr[a] - arr[i])) {
                return false;
            }
        }

        return true;
    }
}
