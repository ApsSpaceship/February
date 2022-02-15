package study4_0215_17;

import java.util.Scanner;

public class Baekjoon_1259_팰린드롬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n;
		boolean result = false;
		while (true) {
			n = sc.next();
			if(n.equals("0")) {
				break;
			}
			int l = n.length();
			//앞 뒤 글자 같은지 판단하고 같으면 result에 true 다르면 false를 대입하고 멈춘다.
			for (int i = 0; i < (l / 2); i++) {
				if (n.charAt(i) == n.charAt(l - i - 1)) {
					result = true;
				} else {
					result = false;
					break;
				}
			}
			if (result == true || l == 1) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}			
		}
	}
}
