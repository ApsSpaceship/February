import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; ++i) {
            int cnt = Cnt(i);
            if (cnt == 0)
                System.out.printf("%d", i);
            else
                for (int j = 0; j < cnt; ++j)
                    System.out.printf("%c", '-');
            System.out.printf(" ");
        }
    }
 
    static int Cnt(int n) {
        int ret = 0;
        while (n != 0) {
            if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9)
                ++ret;
            n /= 10;
        }
        return ret;
    }
}
