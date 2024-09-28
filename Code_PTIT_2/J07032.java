package Code_PTIT_2;


import java.io.*;
import java.util.*;

public class J07032 {
    //static Scanner in = new Scanner(System.in);
    
    static boolean check(int n){
        String s = n + "";
        if(s.length() <= 1 || s.length() % 2 == 0) return false;
        String tmp = "";
        while(n > 0) {
            int x = n % 10;
            if(x % 2 == 0) return false;
            n /= 10;
            tmp += x;
        }
        return s.equals(tmp);
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList) in1.readObject();
        ArrayList<Integer> a2 = (ArrayList) in2.readObject();
        TreeMap<Integer, Long> mp1 = new TreeMap<>();
        TreeMap<Integer, Long> mp2 = new TreeMap<>();
        for (int i = 0; i < a1.size(); i++) {
            int x = a1.get(i);
            if(mp1.get(x) == null) mp1.put(x, 1L);
            else mp1.put(x, mp1.get(x) + 1);
        }
        for (int i = 0; i < a2.size(); i++) {
            int x = a2.get(i);
            if(check(x) && mp1.containsKey(x)) {
                if(mp2.get(x) == null) mp2.put(x, 1L);
                else mp2.put(x, mp2.get(x) + 1);
            }
        }
        int cnt = 0;
        for(Map.Entry<Integer, Long> x : mp2.entrySet()) {
            System.out.println(x.getKey() + " " + (x.getValue() + mp1.get(x.getKey())));
            cnt++;
            if(cnt == 10) break;
        }
    }
}