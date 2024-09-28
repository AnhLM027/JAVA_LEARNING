package Code_PTIT_AnhLM027;


import java.util.*;

public class J05010 {
    static Scanner in = new Scanner(System.in);
    
    static class MatHang {
        private int ma;
        private String name, hang;
        private double mua, ban;

        public MatHang(int ma, String name, String hang, double mua, double ban) {
            this.ma = ma;
            this.name = name;
            this.hang = hang;
            this.mua = mua;
            this.ban = ban;
            in.nextLine();
        }
        
        public void out(){
            System.out.printf("%s %s %s %.2f\n", ma, name, hang, loinhuan());
        }
        
        public double loinhuan(){
            return ban - mua;
        }
        
        public int getMa(){
            return this.ma;
        }
    }
    
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        ArrayList<MatHang> A = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            MatHang a = new MatHang(i, in.nextLine(), in.nextLine(), in.nextDouble(), in.nextDouble());
            A.add(a);
        }
        Collections.sort(A, (MatHang a, MatHang b) -> {
            double x = a.loinhuan();
            double y = b.loinhuan();
            if(x == y) return a.getMa() - b.getMa();
            return Double.compare(y, x);
        });
        for (int i = 0; i < A.size(); i++) {
            A.get(i).out();
        }
    }
}
