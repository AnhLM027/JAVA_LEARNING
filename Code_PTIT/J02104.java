package Code_PTIT;

import java.util.*;

public class J02104 {

    public static class Pair implements Comparable<Pair> {

        private int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair other) {
            if (this.x != other.x) {
                return this.x - other.x;
            }
            return this.y - other.y;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n + 1][n + 1];
        TreeSet<Pair> res = new TreeSet<Pair>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = in.nextInt();
                if (a[i][j] == 1) {
                    if (i > j) res.add(new Pair(j, i));
                    else res.add(new Pair(i, j));
                }
            }
        }
        for (Pair tmp : res) {
            System.out.printf("(%d,%d)\n", tmp.x, tmp.y);
        }
    }
}
