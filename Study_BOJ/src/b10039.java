import java.util.Scanner;

public class b10039 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[5];	//5명의 점수를 저장할 배열
		int sum = 0;	//점수의 총합을 저장할 변수
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			if(array[i] < 40) sum += 40;
			else sum += array[i];
		}
		System.out.println(sum/5);	//5명의 평균을 낸다.
		input.close();
	}

}
