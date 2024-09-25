package Code_PTIT_AnhLM027;

import java.util.*;

public class J02011 {
    
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int ind = i;
            for (int j = i + 1; j < n; j++) {
                if(a[ind] > a[j]) {
                    ind = j;
                }
            }
            int tmp = a[ind];
            a[ind] = a[i];
            a[i] = tmp;
            System.out.printf("Buoc %d: ", i + 1);
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println("");
        }
    }
}
