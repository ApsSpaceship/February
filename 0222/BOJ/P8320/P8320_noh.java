import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int rt = (int) Math.sqrt(n);
		for (int i = 1; i <= rt; ++i)
			for (int j = i; i * j <= n; ++j)
				++sum;
		System.out.printf("%d", sum);
	}
}
