package Code_PTIT_AnhLM027;


import java.io.*;
import java.util.*;

public class J07017 {
    static Scanner in = new Scanner(System.in);
    
    static boolean snt(int n){
        if(n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    
    
    static class Pair<U, V> {
    public final U first;
    public final V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }
    
    public boolean isPrime() {
            if (first instanceof Integer && second instanceof Integer) {
                int f = (Integer) first;
                int s = (Integer) second;
                return snt(f) && snt(s);
            }
            return false;
        }

    @Override
    public String toString() {
        return first + " " + second;
    }
}
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
