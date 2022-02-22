import java.util.Scanner;

public class baekjoon_1244_스위치켜고끄기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int[] swit = new int[size + 1];
		for (int i = 1; i < swit.length; i++) {
			swit[i] = sc.nextInt();
		}
		
		int num = sc.nextInt(); // 학생수
		int[][] student = new int[num][2];
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < 2; j++) {
				student[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < num; i++) {
			// 남학생일때
			if (student[i][0] == 1) {
				for (int j = 1; j < swit.length; j++) {
					//남학생이 받은 스위치 번호의 배수에 해당하는 스위치 온오프 바꿈
					if (j % student[i][1] == 0) {
						if (swit[j] == 1) {
							swit[j] = 0;
						} else {
							swit[j] = 1;
						}
					}
				}
			}		
			// 여학생일때
			else if (student[i][0] == 2) {
				// 좌우로 체크할 수 있는 범위
				int l = Math.min(student[i][1] - 1, swit.length - 1 - student[i][1]);
				int max = 0;
				//좌우가 대칭되는 최대 범위 알아내고 그 범위만큼 스위치 온오프 체인지
				for (int k = 1; k <= l; k++) {
					if (swit[student[i][1] - k] == swit[student[i][1] + k]) {
						//max = Math.max(max, k);
					}else {
						break;
					}
					max = Math.max(max, k);
				}
				for(int c = (student[i][1] - max) ; c <= (student[i][1] + max); c++) {
					if (swit[c] == 1) {
						swit[c] = 0;
					} else {
						swit[c] = 1;
					}
				}
			}
		}		
		
		for(int i = 1; i < swit.length; i++) {
			System.out.print(swit[i]+" ");
			// 20개씩 출력
			if((i)% 20 == 0) {
				System.out.println();
			}
		}		
	}
}
