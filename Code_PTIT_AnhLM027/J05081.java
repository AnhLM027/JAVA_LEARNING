package Code_PTIT_AnhLM027;

import java.util.*;

public class J05081  {
    static Scanner in = new Scanner(System.in);
    
    static class MatHang{
        String ma, name, dvi;
        long mua, ban;
        static int  cnt = 1;
        int tt = 1;

        public MatHang(String name, String dvi, long mua, long ban) {
            this.ma = "" + cnt;
            while(ma.length() < 3) ma = "0" + ma;
            ma = "MH" + ma;
            this.name = name;
            this.dvi = dvi;
            this.mua = mua;
            this.ban = ban;
            tt = cnt;
            cnt++;
        }
        
        long LoiNhuan() {
            return ban - mua;
        }
        
    }
    
    public static void main(String[] arg) {
        int n = in.nextInt();
        ArrayList<MatHang> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            in.nextLine();
            MatHang A = new MatHang(in.nextLine(), in.next(), in.nextLong(), in.nextLong());
            res.add(A);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                MatHang a = res.get(j), b = res.get(j + 1);
                if(a.LoiNhuan() < b.LoiNhuan()) {
                    Collections.swap(res, j, j + 1);
                }
                else if(a.LoiNhuan() == b.LoiNhuan() && a.tt > b.tt) {
                    Collections.swap(res, j, j + 1);
                }
            }
        }
        for(MatHang x : res) {
            System.out.println(x.ma + " " + x.name + " " + x.dvi + " " + x.mua + " " + x.ban + " " + x.LoiNhuan());
        }
    }
}
