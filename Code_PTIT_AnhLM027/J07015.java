package Code_PTIT_AnhLM027;


import java.io.*;
import java.util.*;

public class J07015 {
    //static Scanner in = new Scanner(System.in);
    
    static boolean snt(int n){
        if(n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        TreeMap<Integer, Integer> mp = new TreeMap();
        ArrayList<Integer> a = (ArrayList) in.readObject();
        for (int i = 0; i < a.size(); i++) {
            int x = a.get(i);
            if(snt(x)) {
                if(mp.get(x) == null) mp.put(x, 1);
                else mp.put(x, mp.get(x) + 1);
            }
        }
        for(Map.Entry<Integer, Integer> x : mp.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
