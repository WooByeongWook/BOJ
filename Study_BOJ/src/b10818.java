import java.util.Scanner;

public class b10818 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int n = input.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = input.nextInt();	
		}
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i < n; i++) {
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		System.out.println(min + " " + max);
		input.close();

	}

}
