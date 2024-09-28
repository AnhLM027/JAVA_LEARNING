package Code_PTIT_AnhLM027;

import java.util.*;

public class J04019 {
    static Scanner in = new Scanner(System.in);
    
    static class Point {
        public double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        
        public static Point nextPoint(Scanner sc){
            Point A = new Point(sc.nextDouble(), sc.nextDouble());
            return A;
        }
        
    }
    
    static double KC(Point a, Point b){
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }
    
    static class Triangle{
        Point a, b, c;
        double c1, c2, c3;

        public Triangle(Point a, Point b, Point c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.c1 = KC(a, b);
            this.c2 = KC(b, c);
            this.c3 = KC(a, c);
        }
        
        public boolean valid(){
            if(c1 + c2 <= c3 || c1 + c3 <= c2 || c2 + c3 <= c1) return false;
            else return true;
        }
        
        public String getPerimeter(){
            double tmp = c1 + c2 + c3;
            String ans = String.format("%.3f", tmp);
            return ans;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}