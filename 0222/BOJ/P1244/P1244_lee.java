import java.util.Scanner;

public class P1244 {
	static int N;
	static int[] status;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 스위치 개수
		N = sc.nextInt();
		// 스위치 상태 (인덱스 번호맞추기 위해 하나 더 크게)
		status = new int[N+1];
		for(int i = 1; i<= N; i++) {
			status[i] = sc.nextInt();
		}
		// 학생 수 
		int stuN = sc.nextInt();
		// 학생 성별과 부여받은 번호 
		for(int i = 0; i<stuN; i++) {
			int gender = sc.nextInt();
			int num = sc.nextInt();
			if(gender == 1) {
				for(int n = 1; n <= N; n++) {
					// 남학생이 부여받은 번호의 배수인 스위치를 전환한다.
					if(n % num == 0) {
						changeSwitch(n);
					}
				}
			}
			else {
				// 회문 가능 범위 (더 작은 범위의 회문만 가능)
				int size = 0;
				if(num -1 <= N-num) size = num-1;
				else size = N-num;
				// 회문 가능 범위 내 반복
				for(int d =0; d <= size ; d++) {
					// 여학생이 부여 받은 번호의 위치는 스위치 전환
					if(d == 0) {
						changeSwitch(num);
					}else {
						// 회문이 아님을 확인하였을 경우 break;
						if(status[num-d] != status[num+d]) break;
						// 회문일 경우, 해당 위치 스위치 전환
						else {
							changeSwitch(num-d);
							changeSwitch(num+d);
						}
					}
				}
			}
		}
		// 한줄에 20개씩 출력
        for(int i=1; i<=N; i++) {
			System.out.print(status[i] + " ");
			if(i % 20 == 0)
				System.out.println();
		}
		sc.close();
	}
	// 스위치 전환
	public static void changeSwitch(int n) {
		if(status[n] == 1) status[n] = 0;
		else status[n] = 1;
	}
}
