import java.io.IOException;
import java.util.Scanner;

public class b1712 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		long A = input.nextInt();
		long B = input.nextInt();
		long C = input.nextInt();

		long loss = A;	//�������+�Ѵ�� ���̴� ����� ������ ����
		long profit = 0; //��Ʈ���� �ȾƼ� ���� �̵�
		long count = 0; //����� ���ͺб����� ����� ����
		if(B >= C) {	//���ͺб����� �߻��ȵǴ� ���
			System.out.println("-1");
		}else if(A <= 2100000000 && B <= 2100000000 && C <= 2100000000) {	//21�� �����϶��� ����
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
