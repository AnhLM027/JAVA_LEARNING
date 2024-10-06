package Code_PTIT_2;

import java.io.*;
import java.util.*;

public class J07048 {
    //static Scanner in = new Scanner(System.in);
    
    static class SanPham {
        String ma, name;
        int donGia, baoHanh;

        public SanPham(String ma, String name, int donGia, int baoHanh) {
            this.ma = ma;
            this.name = name;
            this.donGia = donGia;
            this.baoHanh = baoHanh;
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + donGia + " " + baoHanh;
        }
        
    }
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("SANPHAM.in"));
        ArrayList<SanPham> res = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            String ma = in.next();
            in.nextLine();
            String name = in.nextLine();
            int donGia = in.nextInt();
            int baoHanh = in.nextInt();
            res.add(new SanPham(ma, name, donGia, baoHanh));
        }
        Collections.sort(res, (SanPham a, SanPham b) -> {
            if(a.donGia == b.donGia) return a.ma.compareTo(b.ma);
            return b.donGia - a.donGia;
        });
        for(SanPham x : res) System.out.println(x);
    }
}