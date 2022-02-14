import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1018 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int min = 64;
		// 체스판 입력받기
		char[][] arr = new char[N][M];
		for(int i =0; i < N ; i++) {
			String line = br.readLine();
			for(int j=0; j<M; j++) {
				arr[i][j] = line.charAt(j);
			}
		}
		//N-8+1 반복
		for(int i =0; i<N-7; i++) {
			// M-8+1 반
			for(int j =0; j<M-7; j++) {
				// 행 i 열 j 배열 arr 색 확인 후 색칠할 개수 중 최솟값 구하기
				min = Math.min(min, findColor(i, j, arr));
			}
		}
		System.out.println(min);

	}
	public static int findColor(int r, int c, char[][] arr) {
		int rEnd = r+8;
		int cEnd = c+8;
		int cnt =0;
		
		// 첫번째 칸 색 구하기
		char color = arr[r][c];
		
		for(int i =r; i < rEnd; i++) {
			for(int j =c; j < cEnd; j++) {
				if(arr[i][j] != color) {
					cnt++;
				}
				// 옆칸 이동시 색 변경
				color = changeColor(color);
				
			}
			// 다음 줄 이동시 색 변경
			color = changeColor(color);
		}
		if(cnt > 64-cnt) {
			// 첫째 칸을 기준으로 할 때의 색칠할 개수 : cnt
			// 첫째와 반대되는 색 기준일때, 색칠할 개수 : 64-cnt
			// 둘 중 최솟값을 리턴
			cnt = 64-cnt;
		}
		
		return cnt;
	}
	public static char changeColor(char color) {
		if(color == 'B') {
			color = 'W';
		}else if(color == 'W'){ 
			color = 'B';
		}
		return color;
	}

}
