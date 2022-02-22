import java.util.Scanner;

public class bj_13300_방배정 {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		int stu = sc.nextInt();
		int num = sc.nextInt();

		int[][] room = new int[2][7];

		for (int s = 0; s < stu; s++) {

			int r = sc.nextInt();
			int c = sc.nextInt();

			room[r][c]++;
		}

		int sum = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 7; j++) {

				if (room[i][j] > 0) {

					if (room[i][j] % num == 0) {
						sum += room[i][j] / num;
					} else {
						sum += (room[i][j] / num) + 1;
					}

				}
			}
		}

		System.out.println(sum);
	}

}
