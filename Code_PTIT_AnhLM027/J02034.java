package Code_PTIT_AnhLM027;

import java.util.*;

public class J02034 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int max = (int) -1e9;

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (a[i] > max) max = a[i];
        }
        int[] cnt = new int[max + 1];
        for (int i = 0; i <= max; i++) cnt[i] = 0;
        for (int i = 0; i < n; i++) {
            cnt[a[i]] = 1;
        }
        int ok=1;
        for (int i = 1; i <= max; i++) {
            if (cnt[i]==0) {
                System.out.println(i);
                ok=0;
            }
        }
        if(ok==1) System.out.println("Excellent!");
    }
}
