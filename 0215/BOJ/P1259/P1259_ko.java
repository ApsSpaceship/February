package Study_20220211_17;

import java.util.Scanner;

public class Solvedac_1259_팰린드롬수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String num = sc.next(); // 숫자 입력
			if (num.equals("0")) { // 숫자가 0인 경우 종료
				break;
			}
			char[] numList = num.toCharArray(); // char배열로 바꾸기
			String ans = "yes"; // 답은 yes로 초기화
			for (int i = 0; i < numList.length / 2; i++) { // 절반만큼
				if (numList[i] != numList[numList.length - 1 - i]) { // 앞 뒤 대칭이 아니라면
					ans = "no"; // 답은 no
					break;
				}
			}
			System.out.println(ans); // 답 출력
		}

	}

}
