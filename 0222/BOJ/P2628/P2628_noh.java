import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n = sc.nextInt();
		int[] cutX = new int[x + 1];
		int[] cutY = new int[y + 1];
		cutX[0] = 1;
		cutX[x] = 1;
		cutY[0] = 1;
		cutY[y] = 1;
		for (int i = 0; i < n; ++i)
			if (sc.nextInt() == 0)
				cutY[sc.nextInt()] = 1;
			else
				cutX[sc.nextInt()] = 1;
		int maxX = 0;
		int maxY = 0;
		int idxX = 0;
		int idxY = 0;
		for (int i = 0; i <= x; ++i)
			if (cutX[i] == 1) {
				maxX = Math.max(maxX, i - idxX);
				idxX = i;
			}
		for (int i = 0; i <= y; ++i)
			if (cutY[i] == 1) {
				maxY = Math.max(maxY, i - idxY);
				idxY = i;
			}
		System.out.printf("%d", maxX * maxY);
	}
}
