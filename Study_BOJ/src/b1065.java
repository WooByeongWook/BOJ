import java.util.Scanner;

public class b1065 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int end = input.nextInt();
		int count = 0;
		int start = 1;
		b1065 main = new b1065();
		for(int i = start; i <= end; i++) {
			boolean distinct = main.distinction(i);
			if(distinct) count++;
		}
		System.out.println(count);

		input.close();
	}
	public boolean distinction(int num) {
		if(num < 100) return true;
		else if(num < 1000) {
			if(num/100-(num%100)/10 == (num%100)/10-num%10) return true;
			else return false;
		}
		return false;
	}

}
