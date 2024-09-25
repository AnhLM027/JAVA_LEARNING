package Code_PTIT_AnhLM027;

import java.util.*;

public class J04002 {

    static class Rectange {

        public long x, y;
        public String color;

        Rectange(long x, long y, String color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }
    }

    static long Area(Rectange a) {
        return a.x * a.y;
    }
    
    static long Perimeter(Rectange a) {
        return 2 * (a.x + a.y);
    }
    
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long y = in.nextLong();
        String s = in.next();
        String tmp = "";
        tmp += Character.toUpperCase(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            tmp += Character.toLowerCase(s.charAt(i));
        }
        Rectange a = new Rectange(x, y, tmp);
        if(x > 0 && y > 0){
            System.out.print(Perimeter(a) + " " + Area(a) + " " + a.color);
        } else {
            System.out.println("INVALID");
        }
        
    }
}
