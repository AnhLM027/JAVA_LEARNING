package Code_PTIT_2;

import java.util.*;


public class J08015 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int te = in.nextInt();
        while(te-- > 0){
            int n = in.nextInt();
            long k = in.nextInt();
            long[] a = new long[n];
            HashMap<Long, Integer> mp = new HashMap();
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                if(mp.get(a[i]) == null) mp.put(a[i], 1);
                else mp.put(a[i], mp.get(a[i]) + 1);
            }
            long cnt = 0;
            for(Map.Entry<Long, Integer> x : mp.entrySet()){
                if(mp.get(k - x.getKey()) != null){
                    long tmp1 = x.getValue();
                    long tmp2 = mp.get(k - x.getKey());
                    if(x.getKey() == k - x.getKey()) cnt+= tmp1 * (tmp1 - 1) / 2;
                    else cnt += tmp1 * tmp2;
                    mp.put(x.getKey(), null);
                }
            }
            System.out.println(cnt);
        }
    }
}
