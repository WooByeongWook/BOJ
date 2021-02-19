import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b10989 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] array1 = new int[10001];

		for(int i = 0; i < N; i++) {
			array1[Integer.parseInt(br.readLine())]++;
		}
		br.close();

		for(int i = 1; i < array1.length; i++) {
			if(N > 0) {
				for(int j = array1[i]; j > 0; j--) {
					N--;
					wr.write(Integer.toString(i));
		            wr.write(System.lineSeparator());
				}
			}
		}
		wr.close();

	}

}
