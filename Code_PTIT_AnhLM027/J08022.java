package Code_PTIT_AnhLM027;

import java.util.*;


public class J08022 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int te = in.nextInt();
        while(te-- > 0){
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            Stack<Integer> st = new Stack();
            for (int i = n - 1; i >= 0; i--) {
                if(st.empty()) {
                    st.push(-1);
                    st.push(a[i]);
                }
                else {
                    
                }
            }
            st.pop();
            if(!st.isEmpty()) {
                for(int x : st){
                    System.out.print(x + " ");
                }
            }
            for (int i = st.size(); i < n; i++) {
                System.out.print("-1 ");
            }
            System.out.println("");
        }
    }
}
