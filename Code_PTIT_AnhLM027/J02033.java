package Code_PTIT_AnhLM027;



import java.io.*;
import java.util.*;

public class J02033 {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        int n = in.nextInt();
        long k = in.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }
        Arrays.sort(a);
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] < 0) cnt++;
        }
        if(k <= cnt) {
            for (int i = 0; i < k; i++) a[i] = -a[i];
        }
        else {
            for (int i = 0; i < cnt; i++) a[i] = -a[i];
            Arrays.sort(a);
            k -= cnt;
            if(k % 2 == 1) a[0] = -a[0];
        }
        long sum = 0;
        for(long x : a) sum += x;
        System.out.println(sum);
    }
}
