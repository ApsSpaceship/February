import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] ans = new int[t];
        for (int tc = 0; tc < t; ++tc) {
            char[] text = sc.next().toCharArray();
            int n = text.length;
            int p1 = 0;
            int p2 = 1;
            while (p2 <= n / 2) {
                p1 = 0;
                boolean flag = true;
                while (p2 < n) {
                    if (text[p1] != text[p2]) {
                        p2 = p2 - p1 + 1;
                        flag = false;
                        break;
                    }
                    ++p1;
                    ++p2;
                }
                if (flag) {
                    ans[tc] = p2 - p1;
                    break;
                }
            }
        }
        for (int tc = 0; tc < t; ++tc)
            System.out.printf("#%d %d\n", tc + 1, ans[tc]);
    }
}
