import java.util.Scanner;

public class b1085 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int w = input.nextInt();
		int h = input.nextInt();
		input.close();
		
		int[] array = new int[4];
		array[0] = Math.abs(x-0);
		array[1] = Math.abs(y-0);
		array[2] = Math.abs(x-w);
		array[3] = Math.abs(y-h);
		int mim = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(mim > array[i])
				mim = array[i];
		}
		
		System.out.println(mim);
		
	}

}
