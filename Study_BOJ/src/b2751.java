import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;

public class b2751 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for (int i = 0; i < N; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);
        
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
