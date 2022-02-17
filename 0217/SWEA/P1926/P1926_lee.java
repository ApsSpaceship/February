import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1926 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 입력 받기
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= N; i++) {
			sb.append(i+" ");
		}
		// 배열로 변경
		String[] sArr = sb.toString().split(" ");
		for(int i=0; i< N; i++) {
      // 출력
			System.out.print(changeNum(sArr[i]));
			if(i == N-1) {
				break;
			}// 마지막 제외 공백 출력
			System.out.print(" ");
		}
	}
	public static String changeNum(String str) {
		StringBuilder sb = new StringBuilder();
    // 3,6,9 중 하나라도 포함하고 있을 경우
		if(str.contains("3") || str.contains("6") || str.contains("9")) {
      // 그 길이만큼 반복해서
			for(int j = 0; j<str.length();j++) {
				char c = str.charAt(j) ;
        // 3, 6, 9가 있는 개수 만큼 -(박수표시) 붙이기
				if(c == '3' || c == '6' || c == '9') {
					sb.append("-");
				}
			}
		}else {
      // 3,6,9에 해당되지 않을 경우 str 그대로
			sb.append(str);
		}
		return sb.toString();
	}

}
