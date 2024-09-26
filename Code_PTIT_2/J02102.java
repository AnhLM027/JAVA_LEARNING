package Code_PTIT_2;

import java.util.*;


public class J02102 {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = in.nextInt();
        int[] a = new int[n * n];
        for (int i = 0; i < n * n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n * n - 1; i++) {
            for (int j = 0; j < n * n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        int[][] res = new int[n][n];
        int h1 = 0, h2 = n - 1;
        int c1 = 0, c2 = n - 1;
        int cnt = 0;
        while (h1 <= h2 && c1 <= c2) {
            for (int i = c1; i <= c2; i++) {
                res[h1][i] = a[cnt++];
            }
            h1++;
            for (int i = h1; i <= h2; i++) {
                res[i][c2] = a[cnt++];
            }
            c2--;
            for (int i = c2; i >= c1; i--) {
                res[h2][i] = a[cnt++];
            }
            h2--;
            for (int i = h2; i >= h1; i--) {
                res[i][c1] = a[cnt++];
            }
            c1++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }
    }
}