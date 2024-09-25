package Code_PTIT_AnhLM027;

import java.util.*;

public class J03032 {

    static String rev(String s){
        String tmp="";
        for (int i = s.length() - 1; i >= 0; i--) {
            tmp+=s.charAt(i);
        }
        return tmp;
    }
    
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            String s = in.nextLine();
            String[] res = s.split("\\s");
            for (String x : res) {
                System.out.print(rev(x) + " ");
            }
            System.out.println("");
        }
    }
}
