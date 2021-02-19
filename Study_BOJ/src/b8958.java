import java.util.Scanner;

public class b8958 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] count = new int[n];
		int check = 0;
		String[] arr = new String[n];
		input.nextLine();
		for(int i = 0; i < n; i++) {
			arr[i] = input.nextLine();
			count[i] = 0;
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < arr[i].length(); j++) {
				if(j==0) {
					if(arr[i].substring(j,j+1).equals("O")) {
						check++;
						count[i] += check;
					}
				}else if(j == arr[i].length()-1) {
					if(arr[i].substring(j).equals("O")) {
						check++;
						count[i] += check;
					}
				}else {
					if(arr[i].substring(j,j+1).equals("O")) {
						check++;
						count[i] += check;
					}else
						check = 0;
				}
				
			}
			check = 0;
		}
		for(int i = 0; i < n; i++) {
			System.out.println(count[i]);
		}
		input.close();
	}

}
