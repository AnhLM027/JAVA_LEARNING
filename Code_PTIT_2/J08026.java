package Code_PTIT_2;


import java.util.*;


public class J08026 {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int te = in.nextInt();
        while(te-- > 0) {
            int s = in.nextInt();
            int t = in.nextInt();
            if(s >= t) System.out.println(s - t);
            else {
                int cnt = 0;
                while(s < t) {
                    s *= 2;
                    cnt++;
                }
                System.out.println(s);
            }
        }
    }
}