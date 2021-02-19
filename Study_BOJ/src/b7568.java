import java.util.Scanner;

public class b7568 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] person = new int[N*2];
		int[] check = new int[N];
		for(int i = 0; i < person.length; i++) {
			person[i] = in.nextInt();
		}
		for(int i = 0; i < check.length; i++) {
			check[i] = N;
		}
		for(int i = 0; i < person.length-2; i += 2) {
			for(int j = i+2; j <= person.length-2; j += 2) {
				if(person[i] > person[j] && person[i+1] > person[j+1])
					check[i/2]--;
				else if(person[i] < person[j] && person[i+1] < person[j+1])
					check[j/2]--;
				else {
					check[i/2]--;
					check[j/2]--;
				}
			}
		}
		
		for(int i = 0; i < check.length; i++) {
			System.out.print(check[i] + " ");
		}
		in.close(); 
	}

}
