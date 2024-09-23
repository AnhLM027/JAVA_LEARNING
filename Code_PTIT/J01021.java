package Code_PTIT;

import java.util.*;

public class J01021 {

    static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a, b;
        while (true) {
            a = in.nextLong();
            b = in.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            long ans = 1;
            while (b > 0) {
                if (b % 2 == 1) {
                    ans = (ans * a) % MOD;
                }
                a = (a * a) % MOD;
                b /= 2;
            }
            System.out.println(ans);
        }

        in.close();
    }
}
