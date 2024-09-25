package Code_PTIT_AnhLM027;

import java.util.*;

public class J03007 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            String s = in.next();
            String tmp = "";
            int sum = 0;
            for (int j = s.length() - 1; j >= 0; j--) {
                tmp += s.charAt(j);
                sum += s.charAt(j) - '0';
            }
            if(!s.equals(tmp) || (sum % 10 != 0) || s.charAt(s.length() - 1) != '8') {
                System.out.println("NO");
                continue;
            }
            else System.out.println("YES");
        }
    }
}
