package Code_PTIT_AnhLM027;


import java.util.*;

public class J03021 {
    static Scanner in = new Scanner(System.in);
    
    static int[] number = { 2,3,4,5,6,7,8,9 };
    static String[] chu = { "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz" };
    
    public static void main(String[] args) {
        int te = in.nextInt();
        while(te-- > 0) {
            char[] s = in.next().toCharArray();
            String ans = "";
            for (int i = 0; i < s.length; i++) {
                s[i] = Character.toLowerCase(s[i]);
                boolean ok = true;
                for (int j = 0; j <= 7; j++) {
                    if(!ok) break;
                    for (int k = 0; k < chu[j].length(); k++) {
                        if (s[i] == chu[j].charAt(k)) {
                            ans += number[j];
                            ok = false;
                            break;
                        }
                    }
                }
            }
            String tmp = "";
            for (int i = 0; i < ans.length(); i++) tmp = ans.charAt(i) + tmp;
            if(tmp.equals(ans)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
