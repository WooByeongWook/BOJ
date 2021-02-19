import java.util.Scanner;

public class b11944 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String N = input.next();
		String M = input.next();
		String result = "";

		for(int i = 0; i < Integer.parseInt(N); i++) {
			result += N;
		}
		if(result.length() > Integer.parseInt(M)) {
			for(int i = 0; i < Integer.parseInt(M); i++) {
				System.out.print(result.charAt(i));
			}
		}else
			System.out.print(result);
		input.close();
	}

}
