package Code_PTIT_AnhLM027;

import java.util.*;

public class J04006 {
    static Scanner in = new Scanner(System.in);
    
    static class SinhVien {
        private String name, lop, ns;
        private double GPA;
        
        public void in(){
            name = in.nextLine();
            lop = in.next();
            ns = in.next();
            GPA = in.nextDouble();
            
        }
        public void out(){
            System.out.printf("B20DCCN001 %s %s %s %.2f", name, lop, chuanhoa(ns) , GPA);
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
        SinhVien A = new SinhVien();
        A.in();
        A.out();
    }
}
