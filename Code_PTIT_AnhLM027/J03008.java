package Code_PTIT_AnhLM027;

import java.util.*;

public class J03008 {

    static Boolean snt(int n){
        if(n<2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            String s = in.next();
            String tmp = "";
            Boolean check = true;
            for (int j = s.length() - 1; j >= 0; j--) {
                tmp += s.charAt(j);
                int n = s.charAt(j) - '0';
                if(!snt(n)) check = false;
            }            if(!s.equals(tmp) || !check) {
                System.out.println("NO");
                continue;
            }
            else System.out.println("YES");
        }
    }
}
