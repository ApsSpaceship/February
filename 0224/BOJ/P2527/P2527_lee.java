import java.util.Scanner;

public class P2527 {
	static int x1, x2, y1, y2, p1, p2, q1, q2;
	static char ans;
	public static void main(String[] args) {
		int T = 4;
		Scanner sc = new Scanner(System.in);
		for(int tc = 1; tc<= T; tc++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			p1 = sc.nextInt();
			q1 = sc.nextInt();
			
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			p2 = sc.nextInt();
			q2 = sc.nextInt();
			// 하나라도 서로의 범위 밖이면 겹치지 않는다.
			if(p1 < x2  || x1 > p2 || q1 < y2 || y1 > q2 ) ans = 'd';
			// 4개의 꼭짓점 중 하나라도 동일할 경우, 점 
			else if((p1 == x2 && q1== y2) || (x1 == p2 && q1== y2) || (p1 == x2 && y1 == q2) || (x1 == p2 && y1 == q2)) ans = 'c';
			// 둘다 같은 건 확인하고 넘어왔으니, x 또는 y 둘 중 하나만 겹치는 경우, 선분
			else if(p1 == x2 || x1 == p2 || y1 == q2 || q1 == y2) ans = 'b';
			// 나머지는 직사각형
			else ans = 'a';
			System.out.println(ans);
		}
		sc.close();
	}
}
