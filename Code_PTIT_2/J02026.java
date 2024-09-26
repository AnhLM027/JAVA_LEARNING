package Code_PTIT_2;

import java.util.*;

public class J02026 {
    static Scanner in = new Scanner(System.in);
    
    static void Try(int i, int[] a, int n, int k, String s, int cnt) {
        if(cnt == k) System.out.println(s);
        else {
            for (int j = i + 1 ; j < n; j++) {
                Try(j, a, n, k, s + a[j] + " ", cnt + 1);
            }
        }
    }
    
    public static void main(String[] args) {
        int te = in.nextInt();
        while (te-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextInt();
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        int tmp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = tmp;
                    }
                }
            }
            Try(-1, a, n, k, "", 0);
        }
    }
}