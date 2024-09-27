package Code_PTIT_2;


import java.util.*;

public class J04014 {
    static Scanner in = new Scanner(System.in);
    
    static long gcd(long a, long b){
        while(a > 0) { 
            long tmp = a; a = b % a; b = tmp;
        }
        return b;
    }
    
    static class PhanSo{
        long tu, mau;
        PhanSo(long tu, long mau){
            long uc = gcd(tu,mau);
            this.tu = tu / uc;
            this.mau = mau / uc;
        }

        @Override
        public String toString() {
            return tu + "/" + mau;
        }
    
    }
    
    static String solve(PhanSo A, PhanSo B){
        long tu1 = A.tu * B.mau + A.mau * B.tu;
        long mau1 = A.mau * B.mau;
        long uc1 = gcd(tu1, mau1);
        tu1 /= uc1; mau1 /= uc1;
        tu1 *= tu1; mau1 *= mau1;
        long tu2 = tu1 * A.tu * B.tu;
        long mau2 = mau1 * A.mau * B.mau;
        long uc2 = gcd(tu2, mau2);
        tu2 /= uc2; mau2 /= uc2;
        return tu1 + "/" + mau1 + " " + tu2 + "/" + mau2;
        
    }
    
    public static void main(String[] args) {
        int t = in.nextInt();
        while(t-- > 0){
            PhanSo A = new PhanSo(in.nextLong(), in.nextLong());
            PhanSo B = new PhanSo(in.nextLong(), in.nextLong());
            System.out.println(solve(A, B));
        }
    }
}
