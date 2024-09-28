package Code_PTIT_AnhLM027;

import java.util.*;


public class J02037 {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int te = in.nextInt();
        in.nextLine();
        while(te-- > 0){
            String s = in.nextLine();
            String[] res = s.trim().split("\\s+");
            int chan = 0, le = 0;
            for (int i = 0; i < res.length; i++) {
                int x = Integer.parseInt(res[i]);
                if(x % 2 == 0) chan++;
                else le++;
            }
            int len = res.length;
            if((len % 2 == 0 && chan > le) || (len % 2 != 0 && le > chan)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}