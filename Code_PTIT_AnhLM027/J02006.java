package Code_PTIT_AnhLM027;

import java.util.*;

public class J02006 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        
        TreeSet<Integer> res = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            res.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
            res.add(b[i]);
        }
        
        for (int x : res) {
            System.out.print(x + " ");
        }
        in.close();
    }
}
