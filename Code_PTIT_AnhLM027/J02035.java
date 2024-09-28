package Code_PTIT_AnhLM027;

import java.util.*;

public class J02035 {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int te = in.nextInt();
        while (te-- > 0) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++){
                a[i] = in.nextLong();
            }
            int ind = 0;
            for (int i = 1; i < n; i++) {
                if(a[i - 1] > a[i]) {
                    ind = i;
                    break;
                }
            }
            System.out.println(ind);
        }
    }
}