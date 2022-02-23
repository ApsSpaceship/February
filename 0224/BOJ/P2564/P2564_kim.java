import java.util.Scanner;

public class baekjoon_2564_경비원 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt(); // 가로
		int h = sc.nextInt(); // 세로
		int store = sc.nextInt(); // 상점 개수
		int[][] arr = new int[store][2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		// 1 : 북 / 2 : 남 / 3 : 서 / 4 : 동
		int direction = sc.nextInt(); // 동근이 방향
		int person = sc.nextInt(); // 동근이 위치

		int distance = 0;
		//동근이 북쪽
		if (direction == 1) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i][0] == 1) {
					distance += Math.abs(arr[i][1] - person);
				} else if (arr[i][0] == 2) {
					if (person + arr[i][1] <= d) {
						distance += person + arr[i][1] + h;
					} else {
						distance += (d - person) + (d - arr[i][1]) + h;
					}
				} else if (arr[i][0] == 3) {
					distance += person + arr[i][1];
				} else if (arr[i][0] == 4) {
					distance += (d - person) + arr[i][1];
				}
			}
		//동근이 남쪽
		} else if (direction == 2) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i][0] == 1) {
					if (person + arr[i][1] <= d) {
						distance += person + arr[i][1] + h;
					} else {
						distance += (d - person) + (d - arr[i][1]) + h;
					}
				} else if (arr[i][0] == 2) {
					distance += Math.abs(arr[i][1] - person);
				} else if (arr[i][0] == 3) {
					distance += person + h - arr[i][1];
				} else if (arr[i][0] == 4) {
					distance += (d - person) + (h - arr[i][1]);
				}
			}
		 //동근이 서쪽
		} else if (direction == 3) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i][0] == 1) {
					distance += person + arr[i][1];
				} else if (arr[i][0] == 2) {
					distance += arr[i][1] + h - person;
				} else if (arr[i][0] == 3) {
					distance += Math.abs(arr[i][1] - person);
				} else if (arr[i][0] == 4) {
					if (person + arr[i][1] <= h) {
						distance += person + arr[i][1] + d;
					} else {
						distance += (h - person) + (h - arr[i][1]) + d;
					}
				}
			}
			//동근이 동쪽
		} else if (direction == 4) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i][0] == 1) {
					distance += person + d - arr[i][1];
				} else if (arr[i][0] == 2) {
					distance += d - arr[i][1] + h - person;
				} else if (arr[i][0] == 3) {
					if (person + arr[i][1] <= h) {
						distance += person + arr[i][1] + d;
					} else {
						distance += (h - person) + (h - arr[i][1]) + d;
					}
				} else if (arr[i][0] == 4) {
					distance += Math.abs(arr[i][1] - person);
				}
			}
		}
		System.out.println(distance);
	}
}
