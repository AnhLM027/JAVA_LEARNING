package Code_PTIT_AnhLM027;


import java.io.*;
import java.util.*;

public class J07006 {
    //static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        TreeMap<Integer, Integer> mp = new TreeMap();
        ArrayList<Integer> a = (ArrayList) in.readObject();
        for (int i = 0; i < a.size(); i++) {
            int x = a.get(i);
            if(mp.get(x) == null) mp.put(x, 1);
            else mp.put(x, mp.get(x) + 1);
        }
        for(Map.Entry<Integer, Integer> x : mp.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}