import java.io.IOException;
import java.util.Scanner;

public class b2941 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String in = input.nextLine();
		int count = 0;
		int compareCount = 0;
		for(int i = 0; i < in.length(); i++) {
			if(i == in.length()-1) { //마지막 글자인경우 알파벳이므로 그냥 count++ 후 break
				count++; 
				break;	
			}
			
			//알파벳이 c인경우
			if(in.charAt(i) == 'c') {
				if(in.charAt(i+1) == '=' || in.charAt(i+1) == '-') {
					count++;
					i++;
				}else count++;
			}
			
			//알파벳이 d인경우
			if(in.charAt(i) == 'd') {
				if(in.charAt(i+1) == '-') {	//d- 처리
					count++;
					i++;
				}else if(i<=in.length()-3 && in.charAt(i+1) == 'z' //dz= 처리
						&& in.charAt(i+2) == '=') {
					count++;
					i += 2;
				}else count++;
			}
			
			//알파벳이 lj인 경우
			if(in.charAt(i) == 'l') {
				if(in.charAt(i+1) == 'j') {
					count++;
					i++;
				}else count++;
			}
			
			//알파벳이 nj인경우
			if(in.charAt(i) == 'n') {
				if(in.charAt(i+1) == 'j') {
					count++;
					i++;
				}else count++;
			}
			
			//알파벳이 s=인경우
			if(in.charAt(i) == 's') {
				if(in.charAt(i+1) == '=') {
					count++;
					i++;
				}else count++;
			}
			
			//알파벳이 z=인경우
			if(in.charAt(i) == 'z') {
				if(in.charAt(i+1) == '=') {
					count++;
					i++;
				}else count++;
			}
			
			//다른 알파벳인 경우
			if(compareCount < count) compareCount = count;
			else {
				compareCount++;
				count++;
			}
		}
		System.out.println(count);
		input.close();
	}

}
