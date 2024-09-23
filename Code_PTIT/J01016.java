package Code_PTIT;

import java.util.*;

public class J01016 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int cnt4 = 0, cnt7 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '4') {
                cnt4++;
            } else if (s.charAt(i) == '7') {
                cnt7++;
            }
        }
        int sum = cnt4 + cnt7;
        if (sum == 4 || sum == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
