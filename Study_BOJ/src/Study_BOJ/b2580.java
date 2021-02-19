package Study_BOJ;

import java.util.Scanner;

public class b2580 {
    public static int[][] arr = new int[9][9];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        input.close();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(arr[i][j] + " ");
            }
           System.out.println();
        }
    }


}
