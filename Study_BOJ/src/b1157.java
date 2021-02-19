package Practice_baekjoon;

import java.util.Scanner;

public class b1157 {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      int[] count = new int[26];	//알파벳마다 개수를 저장할 배열 선언
      int number = 0;	//최대값을 저장할 변수
      char an = '?';	//출력하는 단어를 저장할 변수
      
      String word = input.next().toUpperCase();	//대문자로 변경
      
      for(int i = 0; i < word.length(); i++) {
         count[word.charAt(i)-65]++;	//그 알파벳이 속한 방을 count해준다
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