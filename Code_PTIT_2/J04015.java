package Code_PTIT_2;

import java.util.*;

public class J04015  {
    static Scanner in = new Scanner(System.in);
    
    static HashMap<String, Long> Cv = new HashMap<>();
    static void init(){
        Cv.put("HT", (long)2000000);
        Cv.put("HP", (long)900000);
        Cv.put("GV", (long)500000);
    }
    
    public static void main(String[] arg) {
        init();
        String s = in.next();
        in.nextLine();
        String name = in.nextLine();
        long lcb = in.nextLong();
        String cv = s.substring(0, 2);
        String tmp = s.substring(2, 4);
        long hs = Long.parseLong(tmp);
        System.out.printf("%s %s %d %d %d", s, name, hs, Cv.get(cv), Cv.get(cv) + hs * lcb);
    }
}
