import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class b1181 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(bf.readLine());
		String[] arr = new String[N];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = bf.readLine();
		}
		bf.close();

		// 길이로 정렬
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.length(), o2.length());
			}
		});
		int j , len, len_Check;
		for(int i = 0; i < arr.length; i++) {
			len = arr[i].length();

			for(j= i+1; j < arr.length; j++) {
				len_Check = arr[j].length();
				if(len != len_Check) 
					break;
			}

			Arrays.sort(arr, i , j);
			i = j-1;
		}

		bw.write(arr[0]+"\n");
		for(int i = 1; i < N; i++) {
			if(!arr[i-1].equals(arr[i])) 
				bw.write(arr[i]+"\n");
			
			
		}
		bw.close();

	}

}
