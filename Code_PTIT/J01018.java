package Code_PTIT;

import java.util.*;

public class J01018 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while (t > 0) {
            t--;
            String s = in.next();
            String ans = "YES";
            int sum = s.charAt(0) - '0';
            for (int i = 1; i < s.length(); i++) {
                if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != 2) {
                    ans = "NO";
                }
                sum += s.charAt(i) - '0';
            }
            if (sum % 10 != 0) {
                ans = "NO";
            }
            System.out.println(ans);
        }
    }

}
