package Code_PTIT_AnhLM027;

import java.util.*;

public class J03025 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int te = in.nextInt();
        while (te > 0) {
            te--;
            String s = in.next();
            int cnt = 0;
            int l = 0, r = s.length() - 1;
            while (l < r) {
                if (s.charAt(l) != s.charAt(r)) cnt++;
                l++; r--;
            }
            if(s.length() % 2 == 0){
                if(cnt != 1) System.out.println("NO");
                else System.out.println("YES");
            }
            else {
                if(cnt > 1) System.out.println("NO");
                else System.out.println("YES");
            }
        }
    }
}