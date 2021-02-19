import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class b3052 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> arrCheck = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			int a = input.nextInt();
			arrCheck.add(a%42);
		}
		HashSet<Integer> arr = new HashSet<Integer>(arrCheck);
		arrCheck = new ArrayList<Integer>(arr);
		System.out.println(arrCheck.size());
		input.close();

	}

}
