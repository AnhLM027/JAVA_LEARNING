package Code_PTIT_2;

import java.util.*;

public class J04010 {
    static Scanner in = new Scanner(System.in);
    
    static class Point {
        double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        
    }
    
    static double KC(Point a, Point b){
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }
    
    static double S(double a, double b, double c){
        double q = (double)(a + b + c) / 2;
        return Math.sqrt(q * (q - a) * (q - b) * (q - c)); 
    }
    
    public static void main(String[] arg) {
        int t = in.nextInt();
        while (t-- > 0) {
            Point A = new Point(in.nextDouble(), in.nextDouble());
            Point B = new Point(in.nextDouble(), in.nextDouble());
            Point C = new Point(in.nextDouble(), in.nextDouble());
            double c1 = KC(A, B);
            double c2 = KC(B, C);
            double c3 = KC(A, C);
            if(c1 + c2 <= c3 || c1 + c3 <= c2 || c2 + c3 <= c1) {
                System.out.println("INVALID");
            }
            else {
                double R = (c1 * c2 * c3) / (4 * S(c1, c2, c3));
                System.out.printf("%.3f\n", Math.PI * R * R);
            }
        }
    }
}
