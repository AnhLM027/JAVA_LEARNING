package Code_PTIT_AnhLM027;

import java.util.*;

public class J04007 {
    static Scanner in = new Scanner(System.in);
    
    static class NhanVien {
        private String name, gt, ns, dc, mst, khd;
        
        public void in(){
            name = in.nextLine();
            gt = in.next();
            ns = in.next();
            in.nextLine();
            dc = in.nextLine();
            mst = in.next();
            khd = in.next();
        }
        public void out(){
            System.out.printf("00001 %s %s %s %s %s %s", name, gt, chuanhoa(ns), dc, mst, chuanhoa(khd));
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
    
    
    public static void main(String[] arg) {
        NhanVien A = new NhanVien();
        A.in();
        A.out();
    }
}
