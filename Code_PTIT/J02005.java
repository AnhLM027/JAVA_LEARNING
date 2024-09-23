package Code_PTIT;

import java.util.*;

public class J02005 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }

        TreeSet<Integer> res = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) {
                    res.add(a[i]);
                    break;
                }
            }
        }
        for (int x : res) {
            System.out.print(x + " ");
        }
        in.close();
    }
}
