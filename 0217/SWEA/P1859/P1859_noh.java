import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] ans = new long[t];
        for (int tc = 0; tc < t; ++tc) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt();
            int maxPrice = 0;
            long sum = 0;
            for (int i = n - 1; i >= 0; --i) {
                maxPrice = Math.max(maxPrice, arr[i]);
                if (arr[i] < maxPrice)
                    sum += (maxPrice - arr[i]);
            }
            ans[tc] = sum;
        }
        for (int tc = 0; tc < t; ++tc)
            System.out.printf("#%d %d\n", tc + 1, ans[tc]);
    }
}
