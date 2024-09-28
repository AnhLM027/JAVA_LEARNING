package Code_PTIT_AnhLM027;


import java.io.*;
import java.util.*;

public class J07010 {
    //static Scanner in = new Scanner(System.in);
    
    static class SinhVien{
        String ma, name, lop, ns;
        double GPA;

        public SinhVien(int ma, String name, String lop, String ns, double GPA) {
            this.ma = ma + "";
            while(this.ma.length() < 3) this.ma = "0" + this.ma;
            this.ma = "B20DCCN" + this.ma;
            this.name = name;
            this.lop = lop;
            this.ns = chuanhoa(ns);
            this.GPA = GPA;
        }
        
        public void out(){
            System.out.printf("%s %s %s %s %.2f\n", ma, name, lop, ns, GPA);
        }
        
    }
    
    static String chuanhoa(String s){
        String[] t = s.split("/");
        String tmp = "";
        if(t[0].length() == 1) tmp = "0" + t[0] + "/";
        else tmp = t[0] + "/";
        if(t[1].length() == 1) tmp += "0" + t[1] + "/";
        else tmp += t[1] + "/";
        tmp += t[2];
        return tmp;
    }
    
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner in = new Scanner(new File("SV.in"));
        int n = in.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            in.nextLine();
            SinhVien tmp = new SinhVien(i + 1, in.nextLine(), in.next(), in.next(), in.nextDouble());
            a.add(tmp);
        }
        for (int i = 0; i < a.size(); i++) {
            a.get(i).out();
        }
    }
}