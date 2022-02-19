package Study_20220218_24;

import java.util.Scanner;

public class BOJ_8320_직사각형을만드는방법 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = n; // 세로 1개짜리로 n개 만들 수 있음
		int i = 2; // 세로 개수
		while (n - i * i >= 0) { // 세로*세로 부터 시작해서
			sum += 1 + (n - i * i) / i; // (n - i * i)/i : 추가로 가능한 개수
			i++; // 세로 증가
		}
		System.out.print(sum);
	}
}
