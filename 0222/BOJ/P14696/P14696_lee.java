import java.util.Scanner;

public class P14696 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 라운드 수 
		int N = sc.nextInt();
		for(int n = 0; n < N; n++) {
			// a, b 두사람(행), 1 ~ 4 인덱스 맞추기 위해서 크기 5(열) 
			int[][] cards = new int[2][5];
			int a = sc.nextInt();
			for(int i = 0; i<a; i++) cards[0][sc.nextInt()]++;
			int b = sc.nextInt();
			for(int i =0; i< b; i++) cards[1][sc.nextInt()]++;
			// 개수 비교 -> 승자 찾기
			for(int i = 4; i>=1; i--) {
				if(cards[0][i]> cards[1][i]) {
					System.out.println("A");
					break;
				}
				else if(cards[0][i] < cards[1][i]) {
					System.out.println("B");
					break;
				}
				else {
					if(i != 1) continue; 
					else System.out.println("D");
				}
			}
		}
		sc.close();
	}
}
