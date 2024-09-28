package Code_PTIT_AnhLM027;


import java.io.*;
import java.util.*;

public class J07005 {
    //static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
        TreeMap<Integer, Integer> mp = new TreeMap();
        for (int i = 0; i < 100000; i++) {
            int x = in.readInt();
            if(mp.get(x) == null) mp.put(x, 1);
            else mp.put(x, mp.get(x) + 1);
        }
        for(Map.Entry<Integer, Integer> x : mp.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
