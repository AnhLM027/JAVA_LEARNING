package Code_PTIT_AnhLM027;

import java.util.*;

public class J03040 {

    static Boolean check(String t) {
        char[] s = t.toCharArray();
        int l = s.length;
        if (s[0] == s[1] && s[0] == s[2] && s[0] == s[4] && s[0] == s[5]) return true;
        if (s[0] == s[1] && s[0] == s[2] && s[4] == s[5]) return true;
        if ((s[0] == '6' || s[0] == '8')
                && (s[1] == '6' || s[1] == '8')
                && (s[2] == '6' || s[2] == '8')
                && (s[4] == '6' || s[4] == '8')
                && (s[5] == '6' || s[5] == '8')) {
            return true;
        }
        char tmp = s[0];
        for (int i = 1; i < l; i++) {
            if (s[i] == '.') continue;
            if (s[i] <= tmp) return false;
            else tmp = s[i];
        }
        return true;
    }

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while(t-- > 0){
            String s = in.next();
            String[] res = s.split("\\-");
            if(check(res[1])) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}