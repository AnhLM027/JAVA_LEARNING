package Code_PTIT_2;

import java.util.*;


public class J08020 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int te = in.nextInt();
        while(te-- > 0){
            String s = in.next();
            char[] t = s.toCharArray();
            String ans = "YES";
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < t.length; i++) {
                if(t[i] == '(' || t[i] == '{' || t[i] == '[') st.push(t[i]);
                else {
                    if(st.isEmpty()) {
                        ans = "NO"; break;
                    }
                    if(t[i] == ')' && st.peek() == '(') st.pop();
                    else if(t[i] == ']' && st.peek() == '[') st.pop();
                    else if(t[i] == '}' && st.peek() == '{') st.pop();
                    else {
                        ans = "NO"; break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
