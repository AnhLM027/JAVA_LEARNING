package Code_PTIT_AnhLM027;

import java.util.*;

public class J03038 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Set<Character> se = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            se.add(s.charAt(i));
        }
        System.out.println(se.size());
    }
}
