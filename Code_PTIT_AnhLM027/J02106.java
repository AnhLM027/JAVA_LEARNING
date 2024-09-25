package Code_PTIT_AnhLM027;

import java.util.*;

public class J02106 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n + 1][3 + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 3; j++) {
                a[i][j] = in.nextInt();
            }
        }
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            int dem = 0;
            for (int j = 1; j <= 3; j++) {
                if(a[i][j] == 1) dem++;
            }
            if(dem>=2) cnt++;
        }
        System.out.println(cnt);
    }
}
