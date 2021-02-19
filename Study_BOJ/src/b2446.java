import java.util.Scanner;

public class b2446 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int blank = 0;
		for(int i = (2*N-1); i > 0; i-=2) {
			for(int k = 0; k < blank; k++)
				System.out.print(" ");
			for(int j = 0; j < i; j++)
				System.out.print("*");
			blank++;
			System.out.println();
		}
		blank -= 2;
		for(int i = 3; i < 2*N; i+=2) {
			for(int k = 0; k < blank; k++)
				System.out.print(" ");
			for(int j = 0; j < i; j++)
				System.out.print("*");
			blank--;
			System.out.println();
		}
		input.close();
	}

}
