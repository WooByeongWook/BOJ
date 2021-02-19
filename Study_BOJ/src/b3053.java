import java.util.Scanner;


public class b3053 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int R = input.nextInt();
		input.close();
		
		String answer1 = String.format("%.6f", Math.PI*R*R);
		String answer2 = String.format("%.6f", (double)2*R*R);
		System.out.println(answer1);
		System.out.println(answer2);
		
	}

}
