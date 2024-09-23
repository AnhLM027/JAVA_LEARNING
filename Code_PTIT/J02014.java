package Code_PTIT;

import java.util.*;

public class J02014 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            t--;
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int[] dp = new int[n + 1];
            dp[0] = 1;
            for (int i = 1; i <= n; i++) {
                dp[i] = dp[i - 1] + a[i - 1];
            }
            int ans = -1;
            for (int i = 1; i < n; i++) {
                if (dp[i - 1] - dp[0] == dp[n] - dp[i]) {
                    ans = i;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
