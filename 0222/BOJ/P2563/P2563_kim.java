import java.util.Scanner;

public class baekjoon_2563_색종이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 색종이의 개수
		int[][]map = new int[100][100]; // 도화지 크기
		for(int i = 0;  i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			//색종이의 크기 10 * 10
			for(int k = x; k < x+10; k++) {
				for(int j = y; j < y+10; j++) {
					map[k][j] = 1;
				}
			}
		}
		int count = 0;
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
