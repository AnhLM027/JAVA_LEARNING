package Code_PTIT_AnhLM027;


import java.io.*;
import java.util.*;

public class J07008 {
    //static Scanner in = new Scanner(System.in);
    
    static ArrayList<String> res = new ArrayList<>();
    
    static void Try(int i, int[] a, int n, String s, int cnt, int tmp){
        if(cnt >= 2) res.add(s);
        for (int j = i + 1; j < n; j++) {
            if(a[j] > tmp) {
                Try(j, a, n, s + a[j] + " ", cnt + 1, a[j]);
            }
        }
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner in = new Scanner(new File("DAYSO.in"));
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        Try(-1, a, n, "", 0, (int)-1e9);
        Collections.sort(res);
        for(String x : res) {
            System.out.println(x);
        }
    }
}