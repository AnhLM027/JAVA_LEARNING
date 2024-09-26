package Code_PTIT_2;

import java.util.*;

public class J02025 {
    static Scanner in = new Scanner(System.in);

    static boolean snt(int n){
        if(n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    static void Try(int i, int[] a, int sum, String s) {
        if (snt(sum)) {
            System.out.println(s);
        }
        for (int j = a.length - 1; j > i; j--) {
            Try(j, a, sum + a[j], s + a[j] + ' ');
        }
    }
    
    public static void main(String[] args) {
        int te = in.nextInt();
        while (te-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextInt();
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (a[j] < a[j + 1]) {
                        int tmp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = tmp;
                    }
                }
            }
            Try(-1, a, 0, "");
        }
    }
}