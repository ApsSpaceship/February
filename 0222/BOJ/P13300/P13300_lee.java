import java.util.Scanner;

public class P13300 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		// 각 성별 및 학년 별 학생 수(반올림을 위한 float)
		float[][] room = new float[2][7];
		//최소 필요한 방의 개수
		int cnt = 0;
		for(int i =0;i<N;i++) {
			// 각 성별 및 학년 학생 수 추가
			room[sc.nextInt()][sc.nextInt()]++;	
		}
		// 학년 및 성별에 따른 학생수를 고려하여 방의 개수 구하기
		for(int i = 0; i<2; i++) {
			for(int j = 1; j<7;j++) {
				// 최소 인원보다 많으면, 인원을 최소인원으로 나눈 것을 반올림한다. 
				if(room[i][j] > K) cnt += Math.round(room[i][j]/K);
				// 1명이상 최소인원보다 적거나 같은 경우는 필요한 방의 개수가 1개 
				else if(room[i][j] >0 && room[i][j] <=K) cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
