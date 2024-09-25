package Code_PTIT_AnhLM027;

import java.util.*;

public class J02007 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = in.nextInt();
            Map<Integer, Integer> mp = new HashMap<>();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = in.nextInt();
                mp.put(a[j], mp.getOrDefault(a[j], 0) + 1);
            }
            System.out.println("Test " + i +":");
            for (int j = 0; j < n; j++) {
                if (mp.getOrDefault(a[j],0) > 0) {
                    System.out.println(a[j] + " xuat hien " + mp.get(a[j]) + " lan");
                    mp.put(a[j], 0);
                }
            }
        }
    }
}
