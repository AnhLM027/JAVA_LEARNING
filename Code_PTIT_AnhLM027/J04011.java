package Code_PTIT_AnhLM027;

import java.util.*;

public class J04011 {
    
    static short[][] res = new short[4][3];
    static int[] tmp = new int[3];
    static int sum;
    
    static class Point3D {
        private short x, y, z;

        public Point3D(int x, int y, int z) {
            this.x = (short)x;
            this.y = (short)y;
            this.z = (short)z;
        }
        
        public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
            res[0][0] = p1.x; res[0][1] = p1.y; res[0][2] = p1.z;
            res[1][0] = p2.x; res[1][1] = p2.y; res[1][2] = p2.z;
            res[2][0] = p3.x; res[2][1] = p3.y; res[2][2] = p3.z;
            res[3][0] = p4.x; res[3][1] = p4.y; res[3][2] = p4.z;
            for (int i = 1; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    res[i][j] = (short) (res[i][j] - res[0][j]);
                }
            }
            tmp[0] = res[2][2] * res[1][1] - res[2][1] * res[1][2];
            tmp[1] = res[1][2] * res[2][0] - res[1][0] * res[2][2];
            tmp[2] = res[1][0] * res[2][1] - res[1][1] * res[2][0];
            sum = tmp[0] * res[3][0] + tmp[1] * res[3][1] + tmp[2] * res[3][2];
            if (sum == 0) return true;
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
}
