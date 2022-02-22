import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int maxH = 0;
		int idxH = -1;
		int maxV = 0;
		int idxV = -1;
		int[] arr = new int[6];
		for (int i = 0; i < 6; ++i) {
			if (sc.nextInt() <= 2) {
				arr[i] = sc.nextInt();
				if (maxH < arr[i]) {
					maxH = arr[i];
					idxH = i;
				}
			} else {
				arr[i] = sc.nextInt();
				if (maxV < arr[i]) {
					maxV = arr[i];
					idxV = i;
				}
			}
		}
		int a = 0;
		int cnt = 0;
		boolean[] check = new boolean[6];
		check[idxH] = true;
		check[idxV] = true;
		int idx1 = -1;
		int idx2 = -1;
		while (true) {
			if (check[a])
				++cnt;
			else
				cnt = 0;
			if (cnt == 2) {
				a = (a + 1) % 6;
				a = (a + 1) % 6;
				idx1 = a;
				a = (a + 1) % 6;
				idx2 = a;
				break;
			}
			a = (a + 1) % 6;
		}
		System.out.printf("%d", k * (maxH * maxV - arr[idx1] * arr[idx2]));
	}
}
