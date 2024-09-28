package Code_PTIT_AnhLM027;

import java.util.*;

public class J04012 {
    static Scanner in = new Scanner(System.in);
    
    static HashMap<String, Integer> cv = new HashMap<>();
    
    static void init(){
        cv.put("GD", 250000);
        cv.put("PGD", 200000);
        cv.put("TP", 180000);
        cv.put("NV", 150000);
    }
    
    static class NhanVien {
        String name, cv;
        int lcb, ngay;

        public NhanVien(String name, int lcb, int ngay, String cv) {
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
            System.out.printf("NV01 %s %d %d %d %d", name, luong, (long)(luong * hs), thuong, (long)thunhap);
        }
    }
    
    public static void main(String[] args) {
        init();
        NhanVien A = new NhanVien(in.nextLine(), in.nextInt(), in.nextInt(), in.next());
        A.out(cv);
        
    }
}
