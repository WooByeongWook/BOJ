import java.util.Scanner;

public class b9020 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();	//케이스 수를 받는 변수
		for(int k = 0; k < testCase; k++) {
			int n = input.nextInt();	//2보다큰 짝수n을 받는 변수
			int plus = n/2;	//차츰 증가시킬 변수
			int minus = n/2; //차츰 감소시킬 변수
			boolean[] num = new boolean[n+1];
			num[0] = false;
			num[1] = false;	//0과1은 소수가아니므로 제외
			
			//배열 초기화
			for(int i = 2; i < num.length; i++) {	
				num[i] = true;
			}
			
			//소수가 아닌 것들은 false로 바꾸는 for문
			for(int i=2; i*i<=n; i++) {
	            for(int j=i*i; j<=n; j+=i) {
	                num[j] = false;        //2를 제외한 2의 배수는 false
	            }
	        }
			
			//최대 8번만 돌면되므로 8번만 도는 for문 생성
			for(int i = 0; i < n/2; i++) {
				if(num[plus] && num[minus]) {
					System.out.println(minus + " " + plus);
					break;
				}else {
					minus--;
					plus++;
				}
			}
		}
		input.close();
	}
}
