import java.util.Scanner;

public class P2669 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] map = new int[101][101];
		for(int s =1; s <= 4; s++) {
      // 왼쪽 하단 좌표
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
      // 오른쪽 상단 좌표
      // 배열에서는 한칸 안쪽의 범위까지 해당
			int x2 = sc.nextInt()-1;
			int y2 = sc.nextInt()-1;
      // 배열에서는 x가 열 y가 행을 의미한다
			for(int y = y1; y <= y2; y++) {
				for(int x = x1; x <= x2; x++) {
					map[y][x] = 1;
				}
			}
		}
		int size = 0;
		for(int i = 1; i < 101; i++) {
			for(int j =1; j < 101; j++) {
				if(map[i][j] == 1) size++;
			}
		}
		System.out.println(size);
		sc.close();
	}
}
