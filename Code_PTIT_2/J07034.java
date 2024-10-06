package Code_PTIT_2;

import java.io.*;
import java.util.*;

public class J07034 {
    //static Scanner in = new Scanner(System.in);
    
    static class MonHoc{
        String ma, name;
        int tinchi;

        public MonHoc(String ma, String name, int tinchi) {
            this.ma = ma;
            this.name = name;
            this.tinchi = tinchi;
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + tinchi;
        }
        
    }
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> res = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            String ma = in.next();
            in.nextLine();
            String name = in.nextLine();
            int tinchi = in.nextInt();
            res.add(new MonHoc(ma, name, tinchi));
        }
        Collections.sort(res, (MonHoc a, MonHoc b) -> {
            return a.name.compareTo(b.name);
        });
        for(MonHoc x : res) System.out.println(x);
    }
}