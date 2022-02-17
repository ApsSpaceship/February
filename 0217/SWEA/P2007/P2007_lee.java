import java.util.Scanner;

public class P2007 {
// 테스트 케이스만 통과, 예외처리 부족
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	for(int tc = 1; tc <= T; tc++) {
    		String str = sc.next();
    		
    		for(int i =1; i <=str.length(); i++) {
    			String s1 = str.substring(0, i);
    			String s2 = str.substring(i, i+i);
    			if(s1.equals(s2)) {
    				System.out.println("#"+tc+" "+s1.length());
    				break;
    			}
    		}
    	}     
    }
}
