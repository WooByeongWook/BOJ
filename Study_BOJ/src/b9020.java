import java.util.Scanner;

public class b9020 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();	//���̽� ���� �޴� ����
		for(int k = 0; k < testCase; k++) {
			int n = input.nextInt();	//2����ū ¦��n�� �޴� ����
			int plus = n/2;	//���� ������ų ����
			int minus = n/2; //���� ���ҽ�ų ����
			boolean[] num = new boolean[n+1];
			num[0] = false;
			num[1] = false;	//0��1�� �Ҽ����ƴϹǷ� ����
			
			//�迭 �ʱ�ȭ
			for(int i = 2; i < num.length; i++) {	
				num[i] = true;
			}
			
			//�Ҽ��� �ƴ� �͵��� false�� �ٲٴ� for��
			for(int i=2; i*i<=n; i++) {
	            for(int j=i*i; j<=n; j+=i) {
	                num[j] = false;        //2�� ������ 2�� ����� false
	            }
	        }
			
			//�ִ� 8���� ����ǹǷ� 8���� ���� for�� ����
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
