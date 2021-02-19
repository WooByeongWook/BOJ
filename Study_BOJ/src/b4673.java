package Practice_baekjoon;

import java.util.ArrayList;
import java.util.Collections;

public class b4673 {

	public static void main(String[] args) {
		int startNum = 1;
		b4673 main = new b4673();
		main.selfNum(startNum);
	}
	public void selfNum(int startNum) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		int upNum = 0;
		while(startNum <10000) {
			if(startNum < 10) {
				upNum = startNum + (startNum%10);
				arrayList.add(upNum);
			}
			else if(startNum < 100) {
				upNum = startNum + (startNum/10) + (startNum%10); 
				arrayList.add(upNum);
			}
			else if(startNum < 1000) {
				upNum = startNum + (startNum/100) + (startNum%100)/10 + ((startNum%100)%10);
				arrayList.add(upNum);
			}
			else if(startNum < 10000) {
				upNum = startNum + (startNum/1000) + (startNum%1000)/100 + ((startNum%100)/10) 
						+ ((startNum%100)%10);
				if(!(upNum>=10000))  arrayList.add(upNum);
				
			}
			startNum++;
		}
		Collections.sort(arrayList);
		for(int i = 1; i < 10000; i++) {	//출력부분
			if(!(arrayList.contains(i))) System.out.println(i);
		}
		
	}

}
