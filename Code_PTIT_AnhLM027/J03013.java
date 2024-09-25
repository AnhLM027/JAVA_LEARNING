package Code_PTIT_AnhLM027;

import java.util.*;

public class J03013 {

    static String rev(String s) {
        String tmp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            tmp += s.charAt(i);
        }
        return tmp;
    }

    static String Hieu(String a, String b) {
        int l1 = a.length(), l2 = b.length();
        int lmax = l1 > l2 ? l1 : l2;
        a = rev(a);
        b = rev(b);
        String res = "";
        int nho = 0;
        for (int i = 0; i < lmax; i++) {
            int x = i < l1 ? a.charAt(i) - '0' : 0;
            int y = i < l2 ? b.charAt(i) - '0' : 0;
            int tmp = x - y - nho;
            if (tmp < 0) {
                tmp += 10;
                nho = 1;
            } else nho = 0;
            res += tmp;
        }
        res = rev(res);
        return res;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int te = in.nextInt();
        for (int i = 0; i < te; i++) {
            String s = in.next();
            String t = in.next();
            int l1 = s.length(),l2 = t.length();
            if(l1 > l2 || (l1 == l2 && s.compareTo(t) > 0)){
                System.out.println(Hieu(s, t));
            }
            else System.out.println(Hieu(t, s));
        }
    }

}
