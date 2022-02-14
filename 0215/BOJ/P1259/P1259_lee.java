import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1259 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String num = br.readLine();
			// 0일 때, 반복문 종료
			if(num.equals("0")) {
				break;
			}else {
				// 팰린드롬수 확인
				StringBuilder sb = new StringBuilder();
				sb.append(num);
				if(num.equals(sb.reverse().toString())) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}
		}
	}

}
