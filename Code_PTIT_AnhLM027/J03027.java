package Code_PTIT_AnhLM027;

import java.util.*;

public class J03027 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Stack<Character> st = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if(!st.empty()){
                char x = st.peek();
                if(x == s.charAt(i)) st.pop();
                else st.push(s.charAt(i));
            }
            else st.push(s.charAt(i));
        }
        if(st.empty()) System.out.println("Empty String");
        for(Character x : st) {
            System.out.print(x);
        }
    }
}
