package Code_PTIT_AnhLM027;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class J07003 {
    //static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
        BigInteger n = new BigInteger(in.next());
        while(n.toString().length() > 1) {
            int l = n.toString().length();
            BigInteger a = new BigInteger(n.toString().substring(0, l / 2));
            BigInteger b = new BigInteger(n.toString().substring(l / 2, l));
            n = a.add(b);
            System.out.println(n);
        }
    }
}
