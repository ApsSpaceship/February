package Study_20220218_24;

import java.util.Scanner;

public class BOJ_2669_직사각형네개의합집합의면적구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0; // 합 초기화
		int[] x = new int[2];
		int[] y = new int[2];
		int[][] vMap = new int[101][101]; // 1~100인덱스 사용
    
    //입력
		for (int i = 0; i < 4; i++) { // 직사각형 4개
			x[0] = sc.nextInt();// 왼아래 좌표
			y[0] = sc.nextInt();
			x[1] = sc.nextInt();// 오른위 좌표
			y[1] = sc.nextInt();
			
      //계산
      for (int j = x[0]; j < x[1]; j++) //사각형 칠해주기
				for (int k = y[0]; k < y[1]; k++)
					vMap[j][k] = 1;
		}

		for (int i = 1; i < 101; i++) //1인 부분 더하기
			for (int j = 1; j < 101; j++)
				sum += vMap[i][j];
		
		//출력
		System.out.print(sum);
	}
}
