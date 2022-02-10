import java.util.Scanner;

public class P1204 {

	public static void main(String[] args) {
		// 입력을 위한 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수 입력
		int T = sc.nextInt();
		// 테스트 케이스 반복 
		for(int tc =0; tc < T; tc++) {
			// 테스트 케이스 인덱스 번호 입력받기
			int tIdx = sc.nextInt();
			// 1000명의 점수 입력 받는 배열
			int[] scores = new int[1000];
			// 1~100 점수 빈도 저장용 배열 생성 (idx 와 통일하기 위해 101 크기로 생성)
			int[] scoNums = new int[101];
			// 1000명의 점수 입력받기, 점수 빈도 배열의 각 점수와 동일한 idx위치에 빈도 1 증가
			for(int i =0; i<1000; i++) {
				int score = sc.nextInt();
				scores[i] = score;
				scoNums[score]++;
			}
			
			// 높은 빈도(=점수빈도 배열의 idx)
			int maxNum = 0;
			// 빈도가 동일할 때 더 높은 점수 출력하므로,
			// 높은 빈도의 더 높은 점수(=점수 빈도 배열의 idx가 높은 것)
			int scoIdx = 0;
			// 1점부터 100점 까지 반복
			for(int i=1; i < 101; i++) {
				// 빈도 비교
				if (maxNum < scoNums[i]) {
					maxNum = scoNums[i];
					// 빈도 배열의 idx = 점수
					scoIdx = i;
				// 같은 빈도일 때 점수 비교해서 더 높은 점수 찾기
				}else if(maxNum == scoNums[i]) {
					if(scoIdx < i) {
						scoIdx = i;
					}
				}
			}
			System.out.println("#"+tIdx+" "+scoIdx);
		}
	}
}
