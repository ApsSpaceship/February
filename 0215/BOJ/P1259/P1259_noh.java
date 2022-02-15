import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String num = sc.next();
			if (num.equals("0"))
				break;
			int p1 = 0;
			int p2 = num.length() - 1;
			boolean isPal = true;
			while (p1 < p2) {
				if (num.charAt(p1) != num.charAt(p2)) {
					isPal = false;
					break;
				}
				++p1;
				--p2;
			}
			System.out.println(isPal ? "yes" : "no");
		}
	}
}
