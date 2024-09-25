package Code_PTIT_AnhLM027;

import java.util.*;

public class J03005 {
    
    static String chuanhoa(String s){
        int l = s.length();
        char[] tmp = s.toCharArray();
        tmp[0] = Character.toUpperCase(tmp[0]);
        for (int i = 1; i < l; i++) {
            tmp[i] = Character.toLowerCase(tmp[i]);
        }
        return new String(tmp);
    }
    
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            String s = in.nextLine();
            String[] res = s.trim().split("\\s+");
            res[0] = res[0].toUpperCase();
            for (int i = 1; i < res.length; i++) {
                System.out.print(chuanhoa(res[i]));
                if(i!=res.length - 1) System.out.print(" ");
            }
            System.out.println(", " + res[0]);
        }
    }
}
