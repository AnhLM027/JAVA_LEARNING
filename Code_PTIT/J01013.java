package Code_PTIT;

import java.util.*;


public class J01013 {

    public static int[] dp = new int[2000005];

    public static void Sang() {
        int limit = 2000000;
        for (int i = 0; i <= limit; i++) {
            dp[i] = i;
        }
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= Math.sqrt(limit); i++) {
            if (dp[i] == i) {
                for (int j = i * i; j <= limit; j += i) {
                    dp[j] = i;
                }
            }
        }
    }

    public static long solve(int n) {
        long sum = 0;
        while (n > 1) {
            sum += (long) dp[n];
            n /= dp[n];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sang();
        int t = in.nextInt();
        long sum = 0;
        while (t > 0) {
            t--;
            int n = in.nextInt();
            sum += solve(n);
        }
        System.out.print(sum);
    }

}
