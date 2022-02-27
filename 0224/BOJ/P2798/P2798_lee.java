import java.util.Scanner;

public class P2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 카드의 개수
		int N = sc.nextInt();
		// 목표 : 3장의 카드의 합
		int M = sc.nextInt();	
		// 카드 배열과 입력
		int[] cards = new int[N];
		for(int i =0; i<N; i++) {
			cards[i] = sc.nextInt();
		}
		// 목표합에 가장 가까운 값 
		int ans = 0;
		// 뒤에 두 개 더 있어야 하므로, -2
		for(int i = 0; i < N-2; i++) {
			// 뒤에 한 개 더 있어야 하므로, -1
			for(int j = i+1; j < N-1; j++) {
				// 남은 것 끝까지 중 하나
				for(int k = j+1; k < N; k++) {
					// 합
					int sumV = cards[i]+cards[j]+cards[k];
					// 목표합을 넘지 않을 때,
					if(sumV <= M) {
						// 값 비교해서 큰 값을 답으로
						if(ans < sumV) ans = sumV;
					}
				}
			}
		}
		System.out.println(ans);
	}

}
