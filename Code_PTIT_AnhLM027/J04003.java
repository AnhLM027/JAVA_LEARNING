package Code_PTIT_AnhLM027;

import java.util.*;

public class J04003 {

    static class PhanSo {

        private long tu, mau;

        PhanSo(long tu, long mau) {
            long ucln = gcd(tu, mau);
            this.tu = tu / ucln;
            this.mau = mau / ucln;
        }

        public long getX() {
            return tu;
        }

        public long getY() {
            return mau;
        }
        
        
    }
    
    static long gcd(long a, long b) {
        while(a > 0) {
            long tmp = a; a = b % a; b = tmp;
        }
        return b;
    }
    
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long y = in.nextLong();
        PhanSo a = new PhanSo(x,y);
        System.out.println(a.getX() + "/" + a.getY());
        
    }
}
