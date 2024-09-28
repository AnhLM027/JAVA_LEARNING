package Code_PTIT_AnhLM027;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class J07004 {
    //static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        while(in.hasNext()){
            int n = in.nextInt();
            //if(n == -1) break;
            if(mp.get(n) == null) mp.put(n, 1);
            else mp.put(n, mp.get(n) + 1);
        }
        for(Map.Entry<Integer, Integer> x : mp.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
