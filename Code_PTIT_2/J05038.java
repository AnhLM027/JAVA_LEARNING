package Code_PTIT_2;

import java.util.*;

public class J05038 {
    static Scanner in = new Scanner(System.in);
    
    static HashMap<String, Integer> cv = new HashMap<>();
    
    static void init(){
        cv.put("GD", 250000);
        cv.put("PGD", 200000);
        cv.put("TP", 180000);
        cv.put("NV", 150000);
    }
    
    static class NhanVien {
        String ma, name, cv;
        int lcb, ngay;

        public NhanVien(int ma, String name, int lcb, int ngay, String cv) {
            this.ma = ma + "";
            if(this.ma.length() < 2) this.ma = "0" + this.ma;
            this.ma = "NV" + this.ma;
            this.name = name;
            this.lcb = lcb;
            this.ngay = ngay;
            this.cv = cv;
        }
        
        public void out(HashMap<String, Integer> cv){
            double hs;
            if(this.ngay < 22) hs = 0;
            else if(this.ngay < 25) hs = 0.1;
            else hs = 0.2;
            long luong = (long)ngay * lcb;
            long thuong = cv.get(this.cv);
            long thunhap = (long)(luong + luong * hs + thuong);
            System.out.printf("%s %s %d %d %d %d\n", ma, name, luong, (long)(luong * hs), thuong, (long)thunhap);
        }
        
        public long getThuNhap(HashMap<String, Integer> cv){
            double hs;
            if(this.ngay < 22) hs = 0;
            else if(this.ngay < 25) hs = 0.1;
            else hs = 0.2;
            long luong = (long)ngay * lcb;
            long thuong = cv.get(this.cv);
            return (long)(luong + luong * hs + thuong);
        }
    }
    
    public static void main(String[] args) {
        init();
        int n = in.nextInt();
        ArrayList<NhanVien> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            in.nextLine();
            NhanVien A = new NhanVien(i + 1, in.nextLine(), in.nextInt(), in.nextInt(), in.next());
            res.add(A);
        }
        long ans = 0;
        for(NhanVien x : res) {
            x.out(cv);
            ans += x.getThuNhap(cv);
        }
        System.out.println("Tong chi phi tien luong: " + ans);
    }
}
