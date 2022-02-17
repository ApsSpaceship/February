package Study_20220218_24;

import java.util.Scanner;

public class BOJ_2563_색종이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] vMap = new int[100][100];
		int num = sc.nextInt();
		int x =0;
		int y=0;
		for(int i=0; i<num;i++) { //세로는 x~x+9까지 가로는 y~y+9까지 1입력
			x = sc.nextInt();
			y=sc.nextInt();
			for(int j =0; j<10; j++) {
				for(int k =0; k<10; k++) {
					vMap[x+j][y+k]=1;
				}
			}
		}
		int sum =0;
		for(int i =0; i<100; i++) { //맵 값 다 더해주기
			for(int j =0; j<100; j++) {
				sum +=vMap[i][j];
			}
		}
		System.out.print(sum); //합 출력
	}

}
