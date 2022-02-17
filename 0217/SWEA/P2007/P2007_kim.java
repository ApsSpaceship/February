package study4_0215_17;

import java.util.Scanner;

public class SwExpertAcademy_2007_패턴마디 {
	//주의!!! 테스트케이스만 통과함
	//문자열의 최대 길이는 30
	//마디의 최대 길이는 10
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int tn = 1; tn <= tc; tn++) {
			String words = sc.next();
						
			int len = 0;	
			
			//최대길이 10
			// 앞에서부터 i개씩 자르면서 자른값이 또 i로 자른 값과 같으면 그게 패턴의 길이!
			for (int i = 1; i <= 10; i++) {
				if ((words.substring(0, i)).equals(words.substring(i, i + i))) {
					len = i;
					break;
				}				
			}		
			System.out.println("#" + tn + " " + len);
		}
	}
}

