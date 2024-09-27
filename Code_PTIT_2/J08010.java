package Code_PTIT_2;


import java.util.*;


public class J08010 {
    static Scanner in = new Scanner(System.in);
    
    static boolean tn(String s) {
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            tmp = s.charAt(i) + tmp;
        }
        return tmp.compareTo(s) == 0;
    }
    
    public static void main(String[] args) {
        int lenmax = 0;
        TreeMap<String, Integer> mp = new TreeMap<>();
        ArrayList<String> res = new ArrayList<>();
        while(in.hasNext()) {
            String s = in.next();
            //if(s.equals("OK")) break;
            if(tn(s)) {
                lenmax = Math.max(lenmax, s.length());
                if(mp.get(s) == null) {
                    res.add(s);
                    mp.put(s, 1);
                }
                else mp.put(s, mp.get(s) + 1);
            }
        }
        for (int i = 0; i < res.size(); i++) {
            if(mp.get(res.get(i)) != null){
                if(res.get(i).length() == lenmax) {
                    System.out.println(res.get(i) + " " + mp.get(res.get(i)));
                }
                mp.put(res.get(i), null);
            }
        }
    }
}