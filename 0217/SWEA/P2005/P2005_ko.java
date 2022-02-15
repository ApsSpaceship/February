package Study_20220211_17;

import java.util.Scanner;

public class SWEA_2005_파스칼의삼각형 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //테스트케이스 개수 입력
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(); // N 입력
			
			System.out.println("#" + tc); //테스트케이스 번호 입력
			
			//pascal1은 다음 값 만들어줄 배열, pascal2은 직전 값 저장해줄 배열
      //N번째까지 사용할 것이기 때문에 N+1까지 생성
			int[] pascal1 = new int[N+1];
			int[] pascal2 = new int[N+1];
			pascal1[0] = 1;
			pascal2[0] = 1;
			
			System.out.println(pascal1[0]); //1은 미리 출력(N은 1 이상)
			for (int i = 2; i <= N; i++) { //i는 해당 줄에 출력할 개수
				for (int j = 1; j < i; j++) {
					pascal1[j] = pascal2[j] + pascal2[j-1]; //왼쪽과 오른쪽 위의 숫자의 합
				}
        
				for(int j =0; j<i; j++) { //pascal1 출력 및 pascal1 값 pascal2로 옮기기
					System.out.print(pascal1[j] + " ");
					pascal2[j]=pascal1[j];
				}
				System.out.println();//엔터
			}
		}
	}
}
