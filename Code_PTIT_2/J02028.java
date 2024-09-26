package Code_PTIT_2;

import java.util.*;

public class J02028 {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int te = in.nextInt();
        while (te-- > 0) {
            int n = in.nextInt();
            long k = in.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++){
                a[i] = in.nextLong();
            }
            String ans = "NO";
            long sum = 0;
            int l = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i];
                while(l < i && sum > k) sum -= a[l++];
                if(sum == k) {
                    ans = "YES"; break;
                }
            }
            System.out.println(ans);
        }
    }
}