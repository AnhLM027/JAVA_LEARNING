package Code_PTIT;

import java.util.*;


public class J01012 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            t--;
            int n = in.nextInt();
            int cnt = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (i % 2 == 0) cnt++;
                    if ((n / i) % 2 == 0) cnt++;
                    if (i % 2 == 0 && i * i == n) cnt--;
                }
            }
            System.out.println(cnt);
        }

    }
}
