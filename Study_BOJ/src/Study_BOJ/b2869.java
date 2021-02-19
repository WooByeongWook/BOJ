package Study_BOJ;

import java.io.IOException;
import java.util.Scanner;

public class b2869 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();	//낮에 올라가는 미터를 나타낼 변수
		double b = input.nextDouble();	//밤에 미끄러지는 미터를 나타낼 변수
		double v = input.nextDouble();	//올라갈 나무의 미터를 나타낼 변수
		
		/*
		 * 목표 높이가 v인데 어차피 도달하면 미끄러지지않으니
		 * 올라가야되는 목표높이를 v-b로 지정하고
		 * 목표높이에 가지못한다면 총 갈 수있는 거리가
		 * a-b이므로 (v-b)/(a-b) 라는 식을 세울수있다.
		 * 여기서 소수점이 생기면 1일을 더해주면된다.(Math.ceil <- 소수점 올림함수)
		 */
		System.out.println((int)Math.ceil((v-b)/(a-b)));
		input.close();
	}

}
