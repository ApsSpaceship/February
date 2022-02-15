package study4_0215_17;

import java.util.Scanner;

public class BaekJoon_1085_직사각형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int min = 1000;
		//x 좌표가 w/2인 값보다 크면 w-x가 가로방향에서 모서리랑 제일 가깝다.
		if(x > w/2) {
			min = min > w-x ? w-x : min;
			
		}else {
			min = min > x ? x : min;
		}
		//y 좌표가 h/2인 값보다 크면 h-y가 세로 방향에서 모서리랑 제일 가깝다.
		if(y > h/2) {
			min = min > h-y ? h-y : min;
		}else {
			min = min > y ? y : min;
		}
		
		System.out.println(min);
		
	}
	
}
