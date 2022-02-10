import java.util.Scanner;

public class P3314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t =1; t <= T; t++) {
			 int ans = 0;
             for(int i = 0; i <5; i++){
                 int score = sc.nextInt();
                 if(score < 40) {
                     score = 40;
                 }
                 ans += score;    
             }
             ans /= 5 ;
             System.out.println("#" + t + " " + ans);
		}
	}
}
