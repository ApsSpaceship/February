import java.util.Scanner;

public class P2563 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 색종이 개수
		int N = sc.nextInt();
		// 도화지
		boolean[][] arr = new boolean[100][100];
		// 색종이가 차지한 넓이
		int size = 0;
		for(int i =0; i<N; i++) {
			// 입력받은 색종이의 왼쪽 하단 좌표
			int R = sc.nextInt();
			int C = sc.nextInt();
			// 색종이크기 10 * 10 
			for(int r = R; r< R+10; r++) 
				for(int c = C; c<C+10; c++)
					//해당 좌표에 위치한 색종이 있음을 표시(겹치는 것 표시하지 않기 위해 false인 경우에 true)
					if(arr[r][c] == false) arr[r][c] = true;
		}
		// 색종이가 차지한 넓이 구하기
		for(int r = 0; r<100; r++)
			for(int c= 0; c<100; c++) 
				if(arr[r][c]) size++;
		System.out.println(size);
	}
}
