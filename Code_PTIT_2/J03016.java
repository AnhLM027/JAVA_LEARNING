package Code_PTIT_2;

import java.math.BigInteger;
import java.util.*;


public class J03016 {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int te = in.nextInt();
        while(te-- > 0){
            BigInteger a = new BigInteger(in.next());
            if(a.mod(BigInteger.valueOf(11)) == BigInteger.ZERO) {
                System.out.println(1);
            }
            else System.out.println(0);
        }
    }
}