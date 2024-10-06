package Code_PTIT_2;


import java.io.File;
import java.io.IOException;
import java.util.*;

public class J07009 {
    //static Scanner sc = new Scanner(System.in);
    
    static class IntSet{
        int[] a;
        IntSet(int[] a){
            this.a = a;
        }
        public IntSet intersection(IntSet b){
            TreeSet<Integer> se = new TreeSet<>();
            for (int i = 0; i < this.a.length; i++) se.add(a[i]);
            TreeSet<Integer> se2 = new TreeSet<>();
            for (int i = 0; i < b.a.length; i++) {
                if(se.contains(b.a[i])) se2.add(b.a[i]);
            }
            int[] ans = new int[se2.size()];
            int cnt = 0;
            for(Integer x : se2) ans[cnt++] = x;
            IntSet res = new IntSet(ans);
            return res;
        }

        @Override
        public String toString() {
            String tmp = "";
            for (int i = 0; i < this.a.length; i++) {
                tmp+= a[i] + " ";
            }
            return tmp;
        }
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
