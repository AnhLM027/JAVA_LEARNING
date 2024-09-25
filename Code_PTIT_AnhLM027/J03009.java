package Code_PTIT_AnhLM027;

import java.util.*;

public class J03009 {
    
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        int te = in.nextInt();
        in.nextLine();
        while (te-- > 0) {
            String s = in.nextLine();
            String t = in.nextLine();
            String[] tmp1 = s.split("\\s+");
            String[] tmp2 = t.split("\\s+");
            TreeSet<String> res = new TreeSet();
            for (int i = 0; i < tmp1.length; i++) {
                res.add(tmp1[i]);
            }
            for (int i = 0; i < tmp2.length; i++) {
                res.remove(tmp2[i]);
            }
            for(String x : res) { 
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
