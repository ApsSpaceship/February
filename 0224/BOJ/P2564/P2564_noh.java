import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n = sc.nextInt();
		int[][] pos = new int[n][2];
		for (int i = 0; i < n; ++i) {
			pos[i][0] = sc.nextInt();
			pos[i][1] = sc.nextInt();
		}
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < n; ++i) {
			switch (a) {
			case 1: // 북
				switch (pos[i][0]) {
				case 1:
					sum += Math.abs(b - pos[i][1]);
					break;
				case 2:
					sum += (y + Math.min(b + pos[i][1], 2 * x - b - pos[i][1]));
					break;
				case 3:
					sum += (b + pos[i][1]);
					break;
				case 4:
					sum += (x - b + pos[i][1]);
					break;
				}
				break;
			case 2:// 남
				switch (pos[i][0]) {
				case 1:
					sum += (y + Math.min(b + pos[i][1], 2 * x - b - pos[i][1]));
					break;
				case 2:
					sum += Math.abs(b - pos[i][1]);
					break;
				case 3:
					sum += (b + y - pos[i][1]);
					break;
				case 4:
					sum += (x - b + y - pos[i][1]);
					break;
				}
				break;
			case 3:// 서
				switch (pos[i][0]) {
				case 1:
					sum += (b + pos[i][1]);
					break;
				case 2:
					sum += (y - b + pos[i][1]);
					break;
				case 3:
					sum += Math.abs(b - pos[i][1]);
					break;
				case 4:
					sum += (x + Math.min(b + pos[i][1], 2 * y - b - pos[i][1]));
					break;
				}
				break;
			case 4:// 동
				switch (pos[i][0]) {
				case 1:
					sum += (b + x - pos[i][1]);
					break;
				case 2:
					sum += (y - b + x - pos[i][1]);
					break;
				case 3:
					sum += (x + Math.min(b + pos[i][1], 2 * y - b - pos[i][1]));
					break;
				case 4:
					sum += Math.abs(b - pos[i][1]);
					break;
				}
				break;
			}
		}
		System.out.printf("%d", sum);
	}
}
