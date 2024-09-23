package Code_PTIT;

import java.util.*;

public class J02013 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }

            }
            int check = 1;
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) check = 0;
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(a[k] + " ");
            }
            if (check == 1) break;
            System.out.println();
        }
    }
}
