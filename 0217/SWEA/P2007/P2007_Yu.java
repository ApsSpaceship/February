
import java.util.Arrays;
import java.util.Scanner;

public class swea_2007_패턴마디의길이 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			String word = sc.next();
			int ans = 0;

			for (int i = 1; i < 10; i++) {

				if (word.substring(0, i).equals(word.substring(i, i + i))) {
					ans = i;
				}

			}
			System.out.println("#"+tc+" "+ans);
		}

	}

}
