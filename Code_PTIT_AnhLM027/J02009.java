package Code_PTIT_AnhLM027;

import java.util.*;


public class J02009 {
    static Scanner in = new Scanner(System.in);
    
    static class Pair implements Comparable<Pair> {
        int x, y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Pair other) {
            if (this.x != other.x) {
                return Integer.compare(this.x, other.x);
            } else {
                return Integer.compare(this.y, other.y);
            }
        }
    }
    
    public static void main(String[] args) {
        int n = in.nextInt();
        ArrayList<Pair> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Pair tmp = new Pair(in.nextInt(), in.nextInt());
            a.add(tmp);
        }
        Collections.sort(a);
        int cnt = a.get(0).x + a.get(0).y;
        for (int i = 1; i < n; i++) {
            if(a.get(i).x >= cnt) cnt= a.get(i).x + a.get(i).y;
            else cnt += a.get(i).y;
        }
        System.out.println(cnt);
    }
}