package Code_PTIT_AnhLM027;

import java.util.*;

public class J02027 {
    static Scanner in = new Scanner(System.in);
    
    static long lowerbound(ArrayList<Integer> a, int l, int r, int x){
        while(l < r) {
            int mid = (l + r) / 2;
            if(a.get(mid) < x) l = mid + 1;
            else r = mid;
        }
        return (long)l;
    }
    
    public static void main(String[] args) {
        int te = in.nextInt();
        while (te-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++){
                a.add(in.nextInt());
            }
            Collections.sort(a);
            long cnt = 0;
            for (int i = 0; i < n - 1; i++) {
                long x = lowerbound(a, i + 1, n, a.get(i) + k) - i - 1;
                cnt += x;
            }
            System.out.println(cnt);
        }
    }
}