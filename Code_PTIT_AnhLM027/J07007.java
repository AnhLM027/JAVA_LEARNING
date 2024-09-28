package Code_PTIT_AnhLM027;


import java.io.*;
import java.util.*;

public class J07007 {
    //static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner in = new Scanner(new File("VANBAN.in"));
        TreeSet<String> se = new TreeSet();
        while(in.hasNext()){
            se.add(in.next().toLowerCase());
        }
        for(String x : se) {
            System.out.println(x);
        }
    }
}