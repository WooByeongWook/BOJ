import java.util.Arrays;
import java.util.Scanner;

public class b2798 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		
		int[] array = new int[N];
		int sum = 0;
		int result = 0;
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		input.close();
		Arrays.sort(array);
		
		for(int i = 0; i < N; i++) {
            for(int j = i+1; j < N; j++) {
                for(int k = j+1; k < N; k++) {
                    sum = array[i] + array[j] + array[k];
                    if(result < sum && sum <= M) {
                        result=sum;
                    }
                }
            }
        }
		System.out.println(result);
	}

}
