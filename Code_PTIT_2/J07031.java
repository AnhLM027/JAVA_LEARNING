package Code_PTIT_2;


import java.io.*;
import java.util.*;

public class J07031 {
    //static Scanner in = new Scanner(System.in);
    
    static boolean snt(int n){
        if(n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList) in1.readObject();
        ArrayList<Integer> a2 = (ArrayList) in2.readObject();
        TreeSet<Integer> se1 = new TreeSet<>();
        TreeSet<Integer> se2 = new TreeSet<>();
        for (int i = 0; i < a1.size(); i++) {
            int x = a1.get(i);
            if(snt(x)) se1.add(x);
        }
        for (int i = 0; i < a2.size(); i++) {
            int x = a2.get(i);
            if(snt(x)) se2.add(x);
        }
        for(int x : se1) {
            if(x > 500000) break;
            if(se2.contains(x)) continue;;
            int y = 1000000 - x;
            if(se1.contains(y) && !se2.contains(y)) {
                System.out.println(x + " " + y);
            }
        }
    }
}
