package Code_PTIT_2;

import java.io.*;
import java.util.*;

public class J07037 {
    //static Scanner in = new Scanner(System.in);
    
    static class DN{
        String ma, name;
        int sl;

        public DN(String ma, String name, int tinchi) {
            this.ma = ma;
            this.name = name;
            this.sl = tinchi;
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + sl;
        }
        
    }
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DN.in"));
        ArrayList<DN> res = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            String ma = in.next();
            in.nextLine();
            String name = in.nextLine();
            int sl = in.nextInt();
            res.add(new DN(ma, name, sl));
        }
        Collections.sort(res, (DN a, DN b) -> {
            return a.ma.compareTo(b.ma);
        });
        for(DN x : res) System.out.println(x);
    }
}