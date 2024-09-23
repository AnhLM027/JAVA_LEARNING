package Code_PTIT;

import java.util.*;

public class J01022 {


    static char solve(long[] dp, int n, long k) {
        if (n == 1) return '0';
        if (n == 2)  return '1';
        if (k <= dp[n - 2]) {
            return solve(dp, n - 2, k);
        } else {
            return solve(dp, n - 1, k - dp[n - 2]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] dp = new long[93];
        dp[1] = dp[2] = 1;
        for (int i = 3; i < 93; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        int t = in.nextInt();
        while (t > 0) {
            t--;
            int n = in.nextInt();
            long k = in.nextLong();
            char x = solve(dp, n, k);
            System.out.println(x);
        }
    }
}
