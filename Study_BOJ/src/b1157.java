package Practice_baekjoon;

import java.util.Scanner;

public class b1157 {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      int[] count = new int[26];	//���ĺ����� ������ ������ �迭 ����
      int number = 0;	//�ִ밪�� ������ ����
      char an = '?';	//����ϴ� �ܾ ������ ����
      
      String word = input.next().toUpperCase();	//�빮�ڷ� ����
      
      for(int i = 0; i < word.length(); i++) {
         count[word.charAt(i)-65]++;	//�� ���ĺ��� ���� ���� count���ش�
         if(number < count[word.charAt(i)-65]) {
            an = word.charAt(i);
            number = count[word.charAt(i)-65];
         }
         else if(number== count[word.charAt(i)-65]) {
            an = '?';
         }
      }
      System.out.println(an);
      input.close();
   }

}