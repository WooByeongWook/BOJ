import java.io.IOException;
import java.util.Scanner;

public class b2941 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String in = input.nextLine();
		int count = 0;
		int compareCount = 0;
		for(int i = 0; i < in.length(); i++) {
			if(i == in.length()-1) { //������ �����ΰ�� ���ĺ��̹Ƿ� �׳� count++ �� break
				count++; 
				break;	
			}
			
			//���ĺ��� c�ΰ��
			if(in.charAt(i) == 'c') {
				if(in.charAt(i+1) == '=' || in.charAt(i+1) == '-') {
					count++;
					i++;
				}else count++;
			}
			
			//���ĺ��� d�ΰ��
			if(in.charAt(i) == 'd') {
				if(in.charAt(i+1) == '-') {	//d- ó��
					count++;
					i++;
				}else if(i<=in.length()-3 && in.charAt(i+1) == 'z' //dz= ó��
						&& in.charAt(i+2) == '=') {
					count++;
					i += 2;
				}else count++;
			}
			
			//���ĺ��� lj�� ���
			if(in.charAt(i) == 'l') {
				if(in.charAt(i+1) == 'j') {
					count++;
					i++;
				}else count++;
			}
			
			//���ĺ��� nj�ΰ��
			if(in.charAt(i) == 'n') {
				if(in.charAt(i+1) == 'j') {
					count++;
					i++;
				}else count++;
			}
			
			//���ĺ��� s=�ΰ��
			if(in.charAt(i) == 's') {
				if(in.charAt(i+1) == '=') {
					count++;
					i++;
				}else count++;
			}
			
			//���ĺ��� z=�ΰ��
			if(in.charAt(i) == 'z') {
				if(in.charAt(i+1) == '=') {
					count++;
					i++;
				}else count++;
			}
			
			//�ٸ� ���ĺ��� ���
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
