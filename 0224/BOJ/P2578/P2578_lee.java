import java.util.Scanner;

public class P2578 {
	static int[][] bingo;
	static int cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bingo = new int[5][5];

		for(int i =0; i<5; i++) {
			for(int j =0; j<5;j++) {
				bingo[i][j] = sc.nextInt();
			}
		}

		for(int n =1; n<=25; n++) {
			int num = sc.nextInt();
			
			// 값이 있으면 0으로변경
			for(int i =0; i<5; i++) {
				for(int j =0; j<5;j++) {
					if(bingo[i][j]== num) bingo[i][j] = 0;
				}
			}
			// 행
			for(int i =0; i<5; i++) {
				int called = 0;
				for(int j =0; j<5; j++) {
					if(bingo[i][j] == 0) called++;
				}
				if(called == 5) cnt++;
			}

			// 열
			for(int i =0; i<5; i++) {
				int called = 0;
				for(int j =0; j<5; j++) {
					if(bingo[j][i] == 0) called++;
				}
				if(called == 5) cnt++;
			}

			// 왼쪽 대각선
			int called = 0;
			for(int i =0; i<5; i++) {
				if(bingo[i][i] == 0) called++;
			}
			if(called == 5) cnt++;

			// 오른쪽 대각선
			called = 0;
			for(int i =0; i<5; i++) {
				if(bingo[i][4-i] == 0) called++;
			}
			if(called == 5) cnt++;
			if(cnt >=3) {
				System.out.println(n);
				break;
			}
			cnt = 0;
		}
		sc.close();
	}
}
