import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][][] ans = new int[t][][];
        for (int tc = 0; tc < t; ++tc) {
            int n = sc.nextInt();
            int[][] board = new int[n][n];
            for (int i = 0; i < n; ++i)
                for (int j = 0; j <= i; ++j)
                    if (j == 0 || j == i)
                        board[i][j] = 1;
                    else
                        board[i][j] = board[i - 1][j - 1] + board[i - 1][j];
            ans[tc] = board;
        }
        for (int tc = 0; tc < t; ++tc) {
            System.out.printf("#%d\n", tc + 1);
            for (int i = 0; i < ans[tc].length; ++i) {
                for (int j = 0; j <= i; ++j)
                    System.out.printf("%d ", ans[tc][i][j]);
                System.out.println();
            }
        }
    }
} 
