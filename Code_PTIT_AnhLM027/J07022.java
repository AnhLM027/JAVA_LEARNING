package Code_PTIT_AnhLM027;


import java.io.*;
import java.util.*;

public class J07022 {
    //static Scanner in = new Scanner(System.in);
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
        ArrayList<String> res = new ArrayList<>();
        while(in.hasNext()){
            String s = in.next();
            //if(s.equals("END")) break;
            boolean check = false;
            for (int i = 0; i < s.length(); i++) {
                if(!Character.isDigit(s.charAt(i))) {
                    check = true;
                    res.add(s);
                    break;
                }
            }
            if(!check) {
                if(s.length() < 11 && Long.parseLong(s) <= Integer.MAX_VALUE) continue;
                else res.add(s);
            }
        }
        Collections.sort(res);
        for(String x : res) System.out.print(x + " ");
    }
}
