package Code_PTIT_AnhLM027;


import java.io.*;
import java.util.*;

public class J07078 {
    
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("STRING.in"));
        //Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s1 = in.next();
            String s2 = in.next();
            for (int i = 0; i <= s1.length() - s2.length(); i++) {
                if (s1.substring(i, i + s2.length()).equals(s2))
                    System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }
}
