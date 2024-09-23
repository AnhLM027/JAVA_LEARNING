package Code_PTIT;

import java.util.*;

public class J01024 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            t--;
            String s = in.next();
            String ans = "YES";
            for (int i = 0; i < s.length(); i++) {
                char x = s.charAt(i);
                if (x != '0' && x != '1' && x != '2') {
                    ans = "NO";
                    break;
                }
            }
            System.out.println(ans);

        }

        in.close();
    }
}
