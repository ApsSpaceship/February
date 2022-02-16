package Study_20220211_17;

import java.util.Scanner;

public class SWEA_2007_패턴마디의길이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			char[] str = sc.next().toCharArray(); //문자열 입력
			int idx2 = 1; //idx2는 2번 마디의 시작
			int idx1 = 0; //idx1은 1번 마디의 인덱스
      
			//마디의 최대 길이는 10
			while (idx1 < str.length-idx2 && idx2 < 10) { 
				idx1 = 0; //idx1 초기화
				while (idx1 < str.length-idx2) {//값이 일치하면 1번 마디 인덱스 증가하여 계속 비교
					if (str[idx1] != str[idx2 + idx1]) { //값이 불일치하면 
						idx2++; //2번 마디 위치 변경
						break;
					}
					idx1++; 
				}
			}
			System.out.printf("#%d %d\n", tc, idx2); //2번 마디 시작위치 == 마디 길이
		}

	}

}
