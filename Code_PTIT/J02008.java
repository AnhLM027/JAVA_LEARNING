package Code_PTIT;

import java.util.*;

public class J02008 {

    static long gcd(long a, long b) {
        while (a > 0) {
            long x = a;
            a = b % a;
            b = x;
        }
        return b;
    }

    static long bcnn(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            t--;
            int n = in.nextInt();
            long ans = 1;
            for (long i = 1; i <= n; i++) {
                ans = bcnn(ans, i);
            }
            System.out.println(ans);
        }
    }
}
