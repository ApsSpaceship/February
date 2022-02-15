package Study_20220211_17;

import java.util.Scanner;

public class Solvedac_1085_직사각형에서탈출 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//입력
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w =sc.nextInt();
		int h = sc.nextInt();
		
		//x, y, x-w, y-h의 절댓값 중 최솟값 찾기
		int min = Math.min(x, y);
		min = Math.min(Math.abs(x-w), min);
		min = Math.min(Math.abs(y-h), min);
		
		System.out.println(min); //출력
	}
}
