import java.util.Scanner;

public class b10039 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[5];	//5���� ������ ������ �迭
		int sum = 0;	//������ ������ ������ ����
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			if(array[i] < 40) sum += 40;
			else sum += array[i];
		}
		System.out.println(sum/5);	//5���� ����� ����.
		input.close();
	}

}
