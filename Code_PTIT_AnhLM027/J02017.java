package Code_PTIT_AnhLM027;


import java.util.*;

public class J02017 {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if(st.size() >= 1){
                int x = st.peek();
                if((x + a[i]) % 2 == 0) st.pop();
                else st.push(a[i]);
            }
            else st.push(a[i]);
        }
        System.out.println(st.size());
    }
}
