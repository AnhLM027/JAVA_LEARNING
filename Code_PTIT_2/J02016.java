package Code_PTIT_2;

import java.util.*;


public class J02016 {
    static Scanner in = new Scanner(System.in);

    
    public static void main(String[] args) {
        int te = in.nextInt();
        while(te-- > 0){
            int n =in.nextInt();
            long[] a = new long[n];
            HashSet<Long> se = new HashSet();
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
                a[i] *= a[i];
                se.add(a[i]);
            }
            String ans = "NO";
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    long x = a[i], y = a[j];
                    if(se.contains(x + y)){
                        ans = "YES"; break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}