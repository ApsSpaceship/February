import java.util.Scanner;

public class backjoon_2669_직사각형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] map = new int[101][101];
		//직사각형 4개의 꼭지점 좌표 2개 입력받음
		for(int i = 0; i < 4; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			for(int j = x1 ; j < x2; j++) {
				for(int k = y1 ; k < y2; k++) {
					map[j][k] = 1; // 입력받은 좌표에 해당하는 맵의 범위에 1을 표시했다.
				}
			}
		}
		int count = 0;
		//맵을 돌면서 1이면 카운트해줌
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map.length; j++) {
				if(map[i][j] == 1) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
		
		
	}

}
