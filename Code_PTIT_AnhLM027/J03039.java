package Code_PTIT_AnhLM027;

import java.util.*;
import java.math.BigInteger;

public class J03039 {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while (t-- > 0) {
            BigInteger a = new BigInteger(in.next());
            BigInteger b = new BigInteger(in.next());
            if ((a.mod(b) == BigInteger.ZERO) || (b.mod(a) == BigInteger.ZERO)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}