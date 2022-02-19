import java.util.Scanner;

public class P8320 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt =0;
		// 가로 변의 길이
		for(int r =1;r<=N;r++) {
			// 직사각형의 넓이는 N을 넘을 수 없고, 이미 개수를 센 직사각형은 필요없으므로, 세로변은 가로변의 길이부터 시작한다.  
			for(int c=r; r*c <= N; c++) cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}
}
