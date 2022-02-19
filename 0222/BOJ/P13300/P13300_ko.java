package Study_20220218_24;

import java.util.Scanner;

public class BOJ_13300_방배정 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int[][] student = new int[2][7];// [0:여자 1:남자][학년 인덱스 1~6사용]
    int sum = 0; //합 초기화
    //입력
		int N = sc.nextInt();
		int K = sc.nextInt();
		for (int i = 0; i < N; i++) {
			student[sc.nextInt()][sc.nextInt()]++;
		}
    
    //계산
		for (int i = 0; i < 2; i++) { // 성별 수 만큼
			for (int j = 1; j < 7; j++) { // 학년 수 만큼
				if (student[i][j] % K > 0) //나눗셈은 버림 계산이므로 남는 수 있으면 방+1
					sum++;
				sum += student[i][j] / K; //방에 들어갈 수 있는 만큼 나눠줌
			}
		}
    
    // 답 출력
		System.out.print(sum);
	}
}
