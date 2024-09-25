package Code_PTIT_AnhLM027;

import java.util.*;

public class J02012 {
    
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(a[i]);
            Collections.sort(res);
            System.out.printf("Buoc %d: ", i);
            for(Integer x : res){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
