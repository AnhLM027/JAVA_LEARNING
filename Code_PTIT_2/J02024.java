package Code_PTIT_2;

import java.util.*;

public class J02024 {
    static Scanner in = new Scanner(System.in);
    
    static void Try(int i, int[] a, int sum, String s) {
        if (sum % 2 == 1) {
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