package Code_PTIT_2;

import java.io.*;
import java.util.*;

public class J07045 {
    static Scanner in = new Scanner(System.in);
    
    static class LoaiPhong implements Comparable<LoaiPhong>{
        String kyHieu, name;
        int donGia;
        double phucvu;

        public LoaiPhong(String tmp) {
            String[] s = tmp.trim().split("\\s+");
            this.kyHieu = s[0];
            this.name = s[1];
            this.donGia = Integer.parseInt(s[2]);
            this.phucvu = Double.parseDouble(s[3]);
        }

        @Override
        public String toString() {
            return kyHieu + " " + name + " " + donGia + " " + phucvu;
        }
        
        @Override
        public int compareTo(LoaiPhong o) {
            return this.name.compareTo(o.name);
        }
    }
    
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
    
}
