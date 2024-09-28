package Code_PTIT_AnhLM027;

import java.util.*;

public class J05057 {
    static Scanner in = new Scanner(System.in);
    
    static HashMap<String, Double> hs = new HashMap<>();
    
    static void init(){
        hs.put("KV1", 0.5);
        hs.put("KV2", 1.0);
        hs.put("KV3", 2.5);
    }
    
    static class SinhVien {
        String ma, name;
        double m1, m2, m3;

        public SinhVien(String ma, String name, double m1, double m2, double m3) {
            this.ma = ma;
            this.name = name;
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
            in.nextLine();
        }
        
        public double tongdiem(HashMap<String, Double> Hs){
            double hs = Hs.get(ma.substring(0,3));
            return m1 * 2 + m2 + m3 + hs;
        }
        
        public void out(HashMap<String, Double> Hs){
            double hs = Hs.get(ma.substring(0,3));
            double tmp = m1 * 2 + m2 + m3;
            double tmp2 = tmp + hs;
            String tt;
            if(tmp2 >= 24) tt = "TRUNG TUYEN";
            else tt = "TRUOT";
            int diem = (int)tmp;
            int hs1 = (int)hs;
            if(hs1 == hs) {
                if(diem == tmp) System.out.println(ma + " " + name + " " + hs1 + " " + diem + " " + tt);
                else System.out.println(ma + " " + name + " " + hs1 + " " + tmp + " " + tt);
            }
            else {
                if(diem == tmp) System.out.println(ma + " " + name + " " + hs + " " + diem + " " + tt);
                else System.out.println(ma + " " + name + " " + hs + " " + tmp + " " + tt);
            }
        }
    }
    
    public static void main(String[] args) {
        init();
        ArrayList<SinhVien> res = new ArrayList<>();
        int n = in.nextInt();
        in.nextLine();
        for (int i = 1; i <= n; i++) {
            SinhVien A = new SinhVien(in.nextLine(), in.nextLine(), in.nextDouble(), in.nextDouble(), in.nextDouble());
            res.add(A);
        }
        for(SinhVien x : res) x.out(hs);
    }
}
