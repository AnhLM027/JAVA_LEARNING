package Code_PTIT_AnhLM027;

import java.util.*;

public class J03006 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            String s = in.next();
            String tmp = "";
            Boolean check = true;
            for (int j = s.length() - 1; j >= 0; j--) {
                tmp += s.charAt(j);
                if((s.charAt(j) - '0') % 2 == 1) check = false;
            }
            if(!check || !s.equals(tmp)) {
                System.out.println("NO");
                continue;
            }
            else System.out.println("YES");
        }
    }
}
