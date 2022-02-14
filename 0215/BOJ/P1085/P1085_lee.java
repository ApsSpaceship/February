import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1085 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 공백을 두고 4개의 숫자 입력받기
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		// 최솟값 min = 가장 큰 값인 1000으로 초기화
		int min = 1000;
		// x, y, w-x, h-y 중 최솟값 찾기
		min = Math.min(Math.min(x, w-x), Math.min(y, h-y));
		System.out.println(min);
	}
}
