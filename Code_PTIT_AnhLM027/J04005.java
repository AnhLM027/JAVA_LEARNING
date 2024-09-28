package Code_PTIT_AnhLM027;

import java.util.*;

public class J04005 {
    static Scanner in = new Scanner(System.in);
    static class SinhVien {
        private String name, ns;
        private double m1, m2, m3;
        
        public void in(){
            name = in.nextLine();
            ns = in.next();
            m1 = in.nextDouble();
            m2 = in.nextDouble();
            m3 = in.nextDouble();
            
        }
        public void out(){
            System.out.printf("%s %s %.1f", name, ns , m1 + m2 + m3);
        }
    }
    
    public static void main(String[] arg) {
        SinhVien A = new SinhVien();
        A.in();
        A.out();
    }
}