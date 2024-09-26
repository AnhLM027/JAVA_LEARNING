package Code_PTIT_2;

import java.util.*;


public class J020356 {
    static Scanner in = new Scanner(System.in);

    static String rev(String a){
        String tmp = "";
        for (int i = 0; i < a.length(); i++) {
            tmp = a.charAt(i) + tmp;
        }
        return tmp;
    }
    
    static String min(int n, int s){
        String ans = "";
        while(s >= 9) {
            ans += "9";
            s -= 9;
        }
        if(s > 0) ans += s + "";
        ans = rev(ans);
        if(ans.length() == n) return ans;
        else {
            s -= 1;
            ans = s + ans.substring(1, ans.length());
            while(ans.length() < n - 1) ans = "0" + ans;
            ans = "1" + ans;
            return ans;
        }
        
    }
    
    static String max(int n, int s){
        String ans = "";
        while(s >= 9) {
            ans += "9";
            s -= 9;
        }
        if(s > 0) ans += s + "";
        while(ans.length() < n) ans += "0";
        return ans;
    }
    
    public static void main(String[] args) {
        int n = in.nextInt();
        int s = in.nextInt();
        if(n == 1 && s == 0) System.out.println("0 0");
        else if(s > 9 * n || s == 0) System.out.println("-1 -1"); 
        else {
            String min = min(n, s);
            String max = max(n, s);
            System.out.println(min + " " + max);
        }
    }
}