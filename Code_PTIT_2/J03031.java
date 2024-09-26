package Code_PTIT_2;


import java.util.*;


public class J03031 {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int te = in.nextInt();
        while(te-- > 0){
            String s = in.next();
            int k = in.nextInt();
            Set<Character> se = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                se.add(s.charAt(i));
            }
            if(26 - se.size() <= k) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}