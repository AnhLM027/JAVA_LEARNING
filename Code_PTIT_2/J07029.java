package Code_PTIT_2;


import java.io.*;
import java.util.*;

public class J07029 {
    //static Scanner in = new Scanner(System.in);
    
    static boolean snt(int n){
        if(n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        TreeMap<Integer, Integer> mp = new TreeMap(Collections.reverseOrder());
        for (int i = 0; i < a.size(); i++) {
            int x = a.get(i);
            if(snt(x)) {
                if(mp.get(x) == null) mp.put(x, 1);
                else mp.put(x, mp.get(x) + 1);
            }
        }
        int cnt = 0;
        for(Map.Entry<Integer, Integer> x : mp.entrySet()) {
            cnt++;
            System.out.println(x.getKey() + " " + x.getValue());
            if(cnt == 10) break;
        }
    }
}
