package Code_PTIT_AnhLM027;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class HELLOFILE {
    //static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Hello.txt"));
        ArrayList<String> a = new ArrayList<>();
        while(in.hasNextLine()){
            String s = in.nextLine();
            //if(s.equals("OK")) break;
            a.add(s);
        }
        for(String x : a) System.out.println(x);
    }
}
