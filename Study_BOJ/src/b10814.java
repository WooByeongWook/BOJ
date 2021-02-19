import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class b10814 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[][] arr = new String[N][2];
		for(int i = 0; i < N; i++) {
			String[] s = br.readLine().split(" ");
			arr[i][0] = s[0];
			arr[i][1] = s[1];
		}
		br.close();

		Arrays.sort(arr, new Comparator<String[]>() {
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 2; j++)
				bw.write(arr[i][j]+" ");
			
			bw.write("\n");
		}
		bw.close();

	}

}
