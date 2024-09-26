package Code_PTIT_2;

import java.util.*;


public class J02036 {
    static Scanner in = new Scanner(System.in);
    
    static long gcd(long a, long b){
        while(a > 0) { long tmp = a; a = b % a; b = tmp;}
        return b;
    }
    
    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
    
    public static void main(String[] args) {
        int te = in.nextInt();
        while(te-- > 0){
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
                if(i == 0) System.out.print(a[i] + " ");
                else System.out.print(lcm(a[i - 1], a[i]) + " ");
                if(i == n - 1) System.out.println(a[i] + " ");
            }
        }
    }
}