package Code_PTIT_AnhLM027;


import java.util.*;

public class J03026 {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int te = in.nextInt();
        while(te-- > 0){
            String s = in.next();
            String t = in.next();
            int ans = -1;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    String tmp = s.substring(i, j);
                    if(!t.contains(tmp)) ans = Math.max(ans, tmp.length());
                }
            }
            for (int i = 0; i < t.length(); i++) {
                for (int j = i + 1; j <= t.length(); j++) {
                    String tmp = t.substring(i, j);
                    if(!s.contains(tmp)) ans = Math.max(ans, tmp.length());
                }
            }
            System.out.println(ans);
        }
    }
}
