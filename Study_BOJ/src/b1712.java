import java.io.IOException;
import java.util.Scanner;

public class b1712 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		long A = input.nextInt();
		long B = input.nextInt();
		long C = input.nextInt();

		long loss = A;	//고정비용+한대당 쓰이는 비용을 저장할 변수
		long profit = 0; //노트북을 팔아서 버는 이득
		long count = 0; //출력할 손익분기점을 계산할 변수
		if(B >= C) {	//손익분기점이 발생안되는 경우
			System.out.println("-1");
		}else if(A <= 2100000000 && B <= 2100000000 && C <= 2100000000) {	//21억 이하일때만 진행
			while(profit <= loss) {
				profit += C;
				loss += B;
				count++;
			}	
			System.out.println(count);
		}
		
		input.close();
	}

}
