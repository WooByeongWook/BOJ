package Study_BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class b2447 {
    
    public static char[][] ary;

    public static void makeStarArray(int x,int y,int num){

        if(num == 1){
            ary[x][y] = '*';
            return;
        }
        int value = num/3;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i == 1 && j == 1);
                else makeStarArray(x+(value*i), y+(value*j), value);
            }
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(input.nextLine());
        input.close();
        ary = new char[size][size];
        
        for(int i=0;i<size;i++){
        	Arrays.fill(ary[i], ' ');
        }
        makeStarArray(0,0,size);

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                sb.append(ary[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
