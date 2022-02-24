import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ans = new char[4];
		for (int tc = 0; tc < 4; ++tc) {
			int ax1 = sc.nextInt();
			int ay1 = sc.nextInt();
			int ax2 = sc.nextInt();
			int ay2 = sc.nextInt();
			int bx1 = sc.nextInt();
			int by1 = sc.nextInt();
			int bx2 = sc.nextInt();
			int by2 = sc.nextInt();
			if (ax1 > bx1) {
				int temp = ax1;
				ax1 = bx1;
				bx1 = temp;

				temp = ax2;
				ax2 = bx2;
				bx2 = temp;
			}
			int X = -1;
			if (ax2 < bx1)
				X = 0;
			else if (ax2 == bx1)
				X = 1;
			else if (ax2 > bx1)
				X = 2;

			if (ay1 > by1) {
				int temp = ay1;
				ay1 = by1;
				by1 = temp;

				temp = ay2;
				ay2 = by2;
				by2 = temp;
			}
			int Y = -1;
			if (ay2 < by1)
				Y = 0;
			else if (ay2 == by1)
				Y = 1;
			else if (ay2 > by1)
				Y = 2;

			if (X == 0 || Y == 0)
				ans[tc] = 'd';
			else if (X == 1 && Y == 1)
				ans[tc] = 'c';
			else if (X == 2 && Y == 2)
				ans[tc] = 'a';
			else
				ans[tc] = 'b';
		}
		for (int tc = 0; tc < 4; ++tc)
			System.out.printf("%c\n", ans[tc]);
	}
}
