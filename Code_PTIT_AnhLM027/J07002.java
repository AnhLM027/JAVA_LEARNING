package Code_PTIT_AnhLM027;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class J07002 {
    //static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(in.hasNext()){
            String s = in.next();
            //if(s.equals("OK")) break;
            if(s.length() > 10) continue;
            boolean check = true;
            for (int i = 0; i < s.length(); i++) {
                if(!Character.isDigit(s.charAt(i))) {
                    check = false; break;
                }
            }
            if(!check) continue;
            long x = Long.parseLong(s);
            if(x <= Integer.MAX_VALUE) sum += x;
        }
        System.out.println(sum);
    }
}
