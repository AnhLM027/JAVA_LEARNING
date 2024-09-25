package Code_PTIT_AnhLM027;

import java.util.*;

public class J03010 {
    
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();
        Map<String, Integer> check = new HashMap();
        while (t-- > 0) {
            String s = in.nextLine();
            String[] res = s.trim().split("\\s+");
            for (int i = 0; i < res.length; i++) {
                res[i] = res[i].toLowerCase();
            }
            int l = res.length;
            String ans = res[l - 1];
            for (int i = 0; i < l - 1; i++) {
                ans += res[i].charAt(0);
            }
            if(check.get(ans) == null) {
                check.put(ans, 2);
            }
            else {
                Integer x = check.get(ans);
                check.put(ans, x + 1);
                ans += x.toString();
            } 
            System.out.println(ans + "@ptit.edu.vn");
        }
    }
}
