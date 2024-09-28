package Code_PTIT_AnhLM027;


import java.util.*;

public class J04021 {
    static Scanner in = new Scanner(System.in);
    
    
    
    static class IntSet{
        int[] a;
        IntSet(int[] a){
            this.a = a;
        }
        public IntSet union(IntSet b){
            TreeSet<Integer> se = new TreeSet<>();
            for (int i = 0; i < this.a.length; i++) se.add(a[i]);
            for (int i = 0; i < b.a.length; i++) se.add(b.a[i]);
            int[] ans = new int[se.size()];
            int cnt = 0;
            for(Integer x : se) ans[cnt++] = x;
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
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
