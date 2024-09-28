package Code_PTIT_AnhLM027;


import java.io.*;
import java.util.*;

public class J07021 {
    //static Scanner in = new Scanner(System.in);
    
    static String chuanhoa(String s){
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
        while(in.hasNextLine()){
            String s = in.nextLine();
            if(s.equals("END")) break;
            String[] res = s.trim().split("\\s+");
            for (String x : res) {
                System.out.print(chuanhoa(x) + " ");
            }
            System.out.println("");
        }
    }
}
