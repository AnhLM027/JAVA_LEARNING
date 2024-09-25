package Code_PTIT_AnhLM027;

import java.util.*;

public class J03004 {
    
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
            for (String x : res) {
                System.out.print(chuanhoa(x) + " ");
            }
            System.out.println("");
        }
    }
}
