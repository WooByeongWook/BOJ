package Study_BOJ;

import java.io.IOException;
import java.util.Scanner;

public class b2869 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();	//���� �ö󰡴� ���͸� ��Ÿ�� ����
		double b = input.nextDouble();	//�㿡 �̲������� ���͸� ��Ÿ�� ����
		double v = input.nextDouble();	//�ö� ������ ���͸� ��Ÿ�� ����
		
		/*
		 * ��ǥ ���̰� v�ε� ������ �����ϸ� �̲�������������
		 * �ö󰡾ߵǴ� ��ǥ���̸� v-b�� �����ϰ�
		 * ��ǥ���̿� �������Ѵٸ� �� �� ���ִ� �Ÿ���
		 * a-b�̹Ƿ� (v-b)/(a-b) ��� ���� ������ִ�.
		 * ���⼭ �Ҽ����� ����� 1���� �����ָ�ȴ�.(Math.ceil <- �Ҽ��� �ø��Լ�)
		 */
		System.out.println((int)Math.ceil((v-b)/(a-b)));
		input.close();
	}

}
