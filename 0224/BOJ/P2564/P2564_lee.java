import java.util.Scanner;

public class P2564 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 블록 가로 세로
		int r = sc.nextInt();
		int c = sc.nextInt();
		// 상점 수
		int n = sc.nextInt();
		// 상점 위치
		int[][] stores= new int[n][2];
		for(int i= 0; i < n; i++) {
			// direction 방향
			stores[i][0] = sc.nextInt();
			// location 위치
			stores[i][1] = sc.nextInt();
		}
		// 동근이 위치
		int dongDir = sc.nextInt();
		int dongLoc = sc.nextInt();

		int ans = 0;
		for(int i =0;i<n;i++) {
			int stDir = stores[i][0];
			int stLoc = stores[i][1];
			// 같은 위치에 있는 상점
			if(dongDir == stDir) {
				ans += Math.abs(dongLoc-stLoc);
			}else {
				switch(dongDir) {
				// 북
				case 1:
					// 동 : r - 동근+가게
					// 서 : 동근 + 가게
					// 남 : r-동근+c+r-가게 vs 동근+c+가게 
					if(stDir == 4) {
						ans += r-dongLoc+stLoc;
					}else if(stDir == 3){
						ans += dongLoc + stLoc;
					}else {
						ans += Math.min((r-dongLoc+c+r-stLoc), (dongLoc+c+stLoc));
					}
					break;
				// 남
				case 2:
					// 동 : r - 동근+c-가게
					// 서 : 동근 +c-가게
					// 북 : r-동근+c+r-가게 vs 동근+c+가게 
					if(stDir == 4) {
						ans += r-dongLoc+c-stLoc;
					}else if(stDir == 3){
						ans += dongLoc + c-stLoc;
					}else {
						ans += Math.min((r-dongLoc+c+r-stLoc), (dongLoc+c+stLoc));
					}
					break;
				// 서
				case 3:
					// 동 : 동근+r+가게 vs c - 동근 +r + c - 가게
					// 남 : c-동근+가게
					// 북 : 동근+가게 
					if(stDir == 4) {
						ans += Math.min((dongLoc+r+stLoc), (c-dongLoc+r+c-stLoc));
					}else if(stDir == 2){
						ans += c-dongLoc+stLoc;
					}else {
						ans += dongLoc+stLoc;
					}
					break;
				// 동
				case 4:
					// 서 : 동근+r+가게 vs c - 동근 +r + c - 가게
					// 남 : c-동근+r-가게
					// 북 : 동근+r-가게 
					if(stDir == 3) {
						ans += Math.min((dongLoc+r+stLoc), (c-dongLoc+r+c-stLoc));
					}else if(stDir == 2){
						ans += c-dongLoc+r-stLoc;
					}else {
						ans += dongLoc+r-stLoc;
					}
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
