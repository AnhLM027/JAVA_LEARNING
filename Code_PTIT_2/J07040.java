package Code_PTIT_2;

import java.io.*;
import java.util.*;

public class J07040 {
    //static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> tmp = (ArrayList<String>) in1.readObject();
        Set<String> a = new HashSet<>();
        for (int i = 0; i < tmp.size(); i++) {
            String[] t = tmp.get(i).trim().split("\\s+");
            for (int j = 0; j < t.length; j++) {
                a.add(t[j].toLowerCase());
            }
        }
        Scanner in2 = new Scanner(new File("VANBAN.in"));
        while(in2.hasNext()) {
            String s = in2.next().toLowerCase();
            if(a.contains(s)) {
                System.out.println(s);
                a.remove(s);
            }
        }
        
    }
}