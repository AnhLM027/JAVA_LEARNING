package Code_PTIT_AnhLM027;

import java.util.*;

public class J02103 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int te = 1; te <= t ; te++) {
            System.out.printf("Test %d:\n", te);
            int n = in.nextInt();
            int m = in.nextInt();

            int[][] a = new int[n + 1][m + 1];
            int[][] b = new int[m + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    b[j][i] = a[i][j] = in.nextInt();
                }
            }
            long[][] res = new long[n + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    for (int k = 1; k <= n; k++) {
                        res[i][k] += (long) a[i][j] * b[j][k];
                    }
                }
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}