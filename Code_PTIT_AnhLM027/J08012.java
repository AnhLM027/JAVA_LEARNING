package Code_PTIT_AnhLM027;

import java.util.*;


public class J08012 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        HashMap<Integer,Integer> mp = new HashMap<>();
        HashSet<Integer> se = new HashSet<>();
        for (int i = 0; i < n - 1; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            se.add(x); se.add(y);
            if(mp.get(x) == null) mp.put(x, 1);
            else mp.put(x, mp.get(x) + 1);
            if(mp.get(y) == null) mp.put(y, 1);
            else mp.put(y, mp.get(y) + 1);
        }
        if(se.size() != n) System.out.println("No");
        else {
            boolean check = false;
            for(Map.Entry<Integer,Integer> x : mp.entrySet()){
                if(x.getValue() == n - 1) check = true;
            }
            if(!check) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
