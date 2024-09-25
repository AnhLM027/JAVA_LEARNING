package Code_PTIT_AnhLM027;

import java.util.*;

public class J03024 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int te = in.nextInt();
        while (te > 0) {
            te--;
            String s = in.next();
            int chan = 0, le = 0;
            Boolean check = true;
            int l = s.length();
            for (int i = 0; i < l; i++) {
                char x = s.charAt(i);
                int num = x - '0';
                if(x < '0' || x > '9') {
                    check = false;
                    break;
                }
                else if(num % 2 == 0) chan++;
                else le++;
            }
            if(!check) System.out.println("INVALID");
            else {
                if(l % 2 == 0 && chan > le) System.out.println("YES");
                else if(l % 2 == 1 && chan < le) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
