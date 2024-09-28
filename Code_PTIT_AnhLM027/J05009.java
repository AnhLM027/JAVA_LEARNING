package Code_PTIT_AnhLM027;


import java.util.*;

public class J05009 {
    static Scanner in = new Scanner(System.in);
    
    static class SV {
        private int ma;
        private String name, ns;
        private double m1, m2, m3;

        public SV(int ma, String name, String ns, double m1, double m2, double m3) {
            this.ma = ma;
            this.name = name;
            this.ns = ns;
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
            in.nextLine();
        }
        
        public void out(){
            System.out.printf("%s %s %s %.1f\n", ma, name, ns, m1 + m2 + m3);
        }
        
        public double tongdiem(){
            return m1 + m2 + m3;
        }
        
        public int getMa(){
            return this.ma;
        }
    }
    
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        double max = -1e9;
        ArrayList<SV> A = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            SV a = new SV(i, in.nextLine(), in.nextLine(), in.nextDouble(), in.nextDouble(), in.nextDouble());
            max = Math.max(max, a.tongdiem());
            A.add(a);
        }
        Collections.sort(A, (SV a, SV b) -> {
            double x = a.tongdiem();
            double y = b.tongdiem();
            if(x == y) return a.getMa() - b.getMa();
            return Double.compare(y, x);
        });
        for (int i = 0; i < A.size(); i++) {
            if(A.get(i).tongdiem() == max) A.get(i).out();
        }
    }
}
