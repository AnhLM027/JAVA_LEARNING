package Code_PTIT_2;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class J07052 {
    //static Scanner in = new Scanner(System.in);
    
    static HashMap<String, Double> hs = new HashMap<>();
    
    static String chuanhoa(String s) {
        String[] res = s.trim().split("\\s+");
        for (int i = 0; i < res.length; i++) {
            res[i] = Character.toUpperCase(res[i].charAt(0)) + res[i].substring(1).toLowerCase();
        }
        String tmp = "";
        for(String x : res) tmp += x + " ";
        return tmp;
    }
    
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
            this.name = chuanhoa(name);
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
        }
        
        public double tongdiem(HashMap<String, Double> Hs){
            double hs = Hs.get(ma.substring(0,3));
            return m1 * 2 + m2 + m3 + hs;
        }
        
        public void out(HashMap<String, Double> Hs, double diemChuan){
            double hs = Hs.get(ma.substring(0,3));
            double tmp = m1 * 2 + m2 + m3;
            double tmp2 = tmp + hs;
            String tt;
            if(tmp2 >= diemChuan) tt = "TRUNG TUYEN";
            else tt = "TRUOT";
            int diem = (int)tmp2;
            int hs1 = (int)hs;
            if(hs1 == hs) {
                if(diem == tmp2) System.out.println(ma + " " + name + " " + hs1 + " " + diem + " " + tt);
                else System.out.println(ma + " " + name + " " + hs1 + " " + tmp2 + " " + tt);
            }
            else {
                if(diem == tmp2) System.out.println(ma + " " + name + " " + hs + " " + diem + " " + tt);
                else System.out.println(ma + " " + name + " " + hs + " " + tmp2 + " " + tt);
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        init();
        Scanner in = new Scanner(new File("THISINH.in"));
        ArrayList<SinhVien> res = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            in.nextLine();
            SinhVien A = new SinhVien(in.nextLine(), in.nextLine(), in.nextDouble(), in.nextDouble(), in.nextDouble());
            res.add(A);
        }
        int chiTieu = in.nextInt();
        Collections.sort(res, (SinhVien a, SinhVien b) -> {
            if(Double.compare(a.tongdiem(hs), b.tongdiem(hs)) == 0) return a.ma.compareTo(b.ma);
            return Double.compare(b.tongdiem(hs), a.tongdiem(hs));
        });
        double diemChuan = res.get(chiTieu - 1).tongdiem(hs);
        System.out.printf("%.1f\n", diemChuan);
        for (int i = 0; i < res.size(); i++) {
            res.get(i).out(hs, diemChuan);
        }
    }
}