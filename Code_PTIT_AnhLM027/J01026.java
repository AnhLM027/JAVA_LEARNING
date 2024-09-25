package Code_PTIT_AnhLM027;

import java.util.*;

public class J01026 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            t--;
            int n = in.nextInt();
            int x = (int) Math.sqrt(n);
            if (x * x == n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

        in.close();
    }
}
