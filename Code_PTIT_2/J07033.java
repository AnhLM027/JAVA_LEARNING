package Code_PTIT_2;

import java.io.*;
import java.util.*;

public class J07033 {
    //static Scanner in = new Scanner(System.in);
    
    static String chuanhoa(String s) {
        String[] res = s.trim().split("\\s+");
        for (int i = 0; i < res.length; i++) {
            res[i] = Character.toUpperCase(res[i].charAt(0)) + res[i].substring(1).toLowerCase();
        }
        String tmp = "";
        for(String x : res) tmp += x + " ";
        return tmp;
    }
    
    static class SinhVien {
        String ma, name, lop, email;

        public SinhVien(String ma, String name, String lop, String email) {
            this.ma = ma;
            this.name = chuanhoa(name);
            this.lop = lop;
            this.email = email;
        }
        
        public void out(){
            System.out.println(ma + " " + name + lop + " " + email);
        }
    }
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        ArrayList<SinhVien> res = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            String ma = in.next();
            in.nextLine();
            String name = in.nextLine();
            String lop = in.next();
            String email = in.next();
            SinhVien A = new SinhVien(ma, name, lop, email);
            res.add(A);
        }
        Collections.sort(res, (SinhVien a, SinhVien b) -> {
            return a.ma.compareTo(b.ma);
        });
        for(SinhVien x : res) x.out();
    }
}