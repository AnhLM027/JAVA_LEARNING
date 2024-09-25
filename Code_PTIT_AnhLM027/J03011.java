package Code_PTIT_AnhLM027;

import java.util.*;

public class J03011 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            long a = in.nextLong();
            String s = in.next();
            long tmp = 0;
            for (int j = 0; j < s.length(); j++) {
                tmp = (s.charAt(j) - '0') + tmp * 10;
                tmp %= a;
            }
            while(a > 0) {
                long x = a; a = tmp % a;tmp = x;
            }
            System.out.println(tmp);
        }
    }
}
