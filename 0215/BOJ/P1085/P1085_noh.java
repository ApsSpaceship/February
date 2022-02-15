import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int minD = 500;
		minD = Math.min(minD, x);
		minD = Math.min(minD, y);
		minD = Math.min(minD, w - x);
		minD = Math.min(minD, h - y);
		System.out.println(minD);
	}
}
