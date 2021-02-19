package Study_BOJ;

import java.util.Scanner;

public class b1002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        int x1, x2, y1, y2, r1, r2;
        for (int i = 0; i < testCase; i++) {
            x1 = input.nextInt();
            y1 = input.nextInt();
            r1 = input.nextInt();
            x2 = input.nextInt();
            y2 = input.nextInt();
            r2 = input.nextInt();

            System.out.println(circlePoint(x1,y1,r1,x2,y2,r2));
        }
    }

    public static int circlePoint(int x1, int y1, int r1, int x2, int y2, int r2) {
        int center_point_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if(x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }
        else if(center_point_pow > Math.pow(r1 + r2, 2)) {
            return 0;
        }
        else if(center_point_pow < Math.pow(r2 - r1, 2)) {
            return 0;
        }
        else if(center_point_pow == Math.pow(r2 - r1, 2)) {
            return 1;
        }
        else if(center_point_pow == Math.pow(r1 + r2, 2)) {
            return 1;
        }
        else {
            return 2;
        }
    }
}
