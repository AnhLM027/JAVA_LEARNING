package Code_PTIT_AnhLM027;

import java.math.BigInteger;
import java.util.*;


public class J03012 {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int te = in.nextInt();
        while(te-- > 0){
            BigInteger a = new BigInteger(in.next());
            BigInteger b = new BigInteger(in.next());
            System.out.println(a.add(b));
        }
    }
}