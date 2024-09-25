package Code_PTIT_AnhLM027;

import java.util.*;

public class J02021 {

    static int n, k;
    static int[] a = new int[100];
    static Boolean ok = true;

    static void Sinh() {
        int i = k;
        while (i >= 1 && a[i] == n - k + i) {
            i--;
        }
        if (i < 1)  ok = false;
        else {
            a[i]++;
            for (int j = i + 1; j < n; j++) {
                a[j] = a[j - 1] + 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        for (int i = 1; i <= n; i++) {
            a[i] = i;
        }
        int cnt = 0;
        while (ok == true) {
            for (int i = 1; i <= k; i++) {
                System.out.print(a[i]);
            }
            System.out.print(" ");
            Sinh();
            cnt++;
        }
        System.out.println("\nTong cong co " + cnt + " to hop");
    }
}
