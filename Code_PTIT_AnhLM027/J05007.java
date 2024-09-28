package Code_PTIT_AnhLM027;


import java.util.*;

public class J05007 {
    static Scanner in = new Scanner(System.in);
    
    static class NhanVien {
        private String ma, name, gt, ns, dc, mst, khd;

        public NhanVien(int ma, String name, String gt, String ns, String dc, String mst, String khd) {
            this.ma = ma + "";
            while(this.ma.length() < 5) this.ma = "0" + this.ma;
            this.name = name;
            this.gt = gt;
            this.ns = chns(ns);
            this.dc = dc;
            this.mst = mst;
            this.khd = chns(khd);
        }
        
        public void out(){
            System.out.printf("%s %s %s %s %s %s %s\n", ma, name, gt, ns, dc, mst, khd);
        }
        
    }
    
    static String chns(String s){
        String[] t = s.split("/");
        String tmp = "";
        if(t[0].length() == 1) tmp = "0" + t[0] + "/";
        else tmp = t[0] + "/";
        if(t[1].length() == 1) tmp += "0" + t[1] + "/";
        else tmp += t[1] + "/";
        return tmp + t[2];
    }
    
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        ArrayList<NhanVien> A = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            NhanVien a = new NhanVien(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            A.add(a);
        }
        Collections.sort(A, (a, b) -> {
            String[] tmp1 = a.ns.trim().split("/");
            String[] tmp2 = b.ns.trim().split("/");
            String s = tmp1[2] + tmp1[0] + tmp1[1];
            String t = tmp2[2] + tmp2[0] + tmp2[1];
            return s.compareTo(t);
        });
        for (int i = 0; i < A.size(); i++) {
            A.get(i).out();
        }
    }
}
