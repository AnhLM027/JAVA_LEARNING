package Code_PTIT_AnhLM027;

import java.util.*;
import java.math.BigInteger;

public class J03033 {
    
    static BigInteger gcd(BigInteger a, BigInteger b){
        if(b.equals(BigInteger.ZERO)) return a;
        return gcd(b, a.mod(b));
    }
    
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(in.next());
            BigInteger b = new BigInteger(in.next());
            System.out.println(a.multiply(b).divide(gcd(a,b)));
        }
    }
}