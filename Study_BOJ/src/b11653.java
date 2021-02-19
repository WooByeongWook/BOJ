package BJ;

import java.util.Scanner;

public class b11653 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 2; i <= Math.sqrt(N); i++) {	// 또는 i * i <= N
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }
        if (N != 1) {
            System.out.println(N);
        }
    }
}
