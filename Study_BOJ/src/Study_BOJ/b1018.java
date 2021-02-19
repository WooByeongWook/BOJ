package Study_BOJ;

import java.util.Scanner;


public class b1018 {
    public static int result = 64; //다시 칠해야되는 정사각형 개수의 최솟값을 담는 변수 result

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int column = input.nextInt();
        boolean[][] chess = new boolean[row][column];   //화이트 일때 true 블랙일때 false
        input.nextLine();
        for (int i = 0; i < row; i++) {
            String in = input.nextLine();
            for (int j = 0; j < column; j++) {
                if (in.charAt(j) == 'W') {   //화이트 일때 true
                    chess[i][j] = true;
                }
            }
        }

        for (int i = 0; i < row - 7; i++) {
            for (int j = 0; j < column - 7; j++) {
                checkResult(chess, i, j);
            }
        }
        System.out.println(result);
    }

    public static void checkResult(boolean[][] chess, int row, int column) {

        boolean start = chess[row][column]; //시작하는 체스판이 화이트인지 블랙인지를 알려주는 변수 start
        int coloring = 0;   //색칠이 몇번되는지를 구하는 변수

        for (int i = row; i < row + 8; i++) {
            for (int j = column; j < column + 8; j++) {

                if (chess[i][j] != start) {
                    coloring++;
                }
                start = !start;
            }
            start = !start;
        }

        coloring = Math.min(coloring, 64 - coloring);
        result = Math.min(result, coloring);
    }
}
