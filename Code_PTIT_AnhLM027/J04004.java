package Code_PTIT_AnhLM027;

import java.util.*;

public class J04004 {

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
    
    static PhanSo Tong(PhanSo a, PhanSo b){
        long x1 = a.getX(), y1 = a.getY();
        long x2 = b.getX(), y2 = b.getY();
        long tu = x1 * y2 + x2 * y1;
        long mau = y1 * y2;
        return new PhanSo(tu,mau);
    }
    
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PhanSo a = new PhanSo(in.nextLong(), in.nextLong());
        PhanSo b = new PhanSo(in.nextLong(), in.nextLong());
        PhanSo ans = Tong(a,b);
        System.out.println(ans.getX() + "/" + ans.getY());
        
    }
}
