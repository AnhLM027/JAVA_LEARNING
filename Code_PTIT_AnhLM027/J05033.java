package Code_PTIT_AnhLM027;

import java.util.*;

public class J05033  {
    static Scanner in = new Scanner(System.in);
    
    static class Time{
        int gio, phut, giay;
        
        int time(){
            return gio * 3600 + phut * 60 + giay;
        }

        public Time(int gio, int phut, int giay) {
            this.gio = gio;
            this.phut = phut;
            this.giay = giay;
        }
        
    }
    
    public static void main(String[] arg) {
        int n = in.nextInt();
        ArrayList<Time> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Time A = new Time(in.nextInt(), in.nextInt(), in.nextInt());
            res.add(A);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Time a = res.get(j), b = res.get(j + 1);
                if(a.time() > b.time()) {
                    Collections.swap(res, j, j + 1);
                }
            }
        }
        for(Time x : res) {
            System.out.println(x.gio + " " + x.phut + " " + x.giay);
        }
    }
}
