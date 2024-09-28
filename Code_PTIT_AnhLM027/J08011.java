package Code_PTIT_AnhLM027;


import java.util.*;


public class J08011 {
    static Scanner in = new Scanner(System.in);
    
    static boolean check(String s) {
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i - 1) > s.charAt(i)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        TreeMap<String, Integer> mp = new TreeMap<>();
        TreeMap<String, Integer> ind = new TreeMap<>();
        int cnt = 1;
        while(in.hasNext()) {
            String s = in.next();
            //if(s.equals("OK")) break;
            if(check(s)) {
                if(mp.get(s) == null) {
                    mp.put(s, 1);
                    ind.put(s, cnt++);
                }
                else mp.put(s, mp.get(s) + 1);
            }
        }
        ArrayList<String> res = new ArrayList<>(mp.keySet());
        Collections.sort(res, (a, b) -> {
            int x = mp.get(a);
            int y = mp.get(b);
            if(x != y) return y - x;
            else return ind.get(a) - ind.get(b);
        });
        for (String s : res) {
            System.out.println(s + " " + mp.get(s));
        }
    }
}