package Code_PTIT_2;

import java.util.*;


public class J08024 {
    static Scanner in = new Scanner(System.in);
    
    static long[] dp = new long[10000];
    static ArrayList<Long> init (){
        Queue<Long> qe = new LinkedList<>();
        qe.add((long)9);
        ArrayList<Long> res = new ArrayList<>();
        while(!qe.isEmpty()){
            long tmp = qe.peek(); qe.poll();
            if(tmp > 1e10) break;
            res.add(tmp);
            qe.add(tmp * 10 + 9);
            qe.add(tmp * 10 + 0);
        }
        
        return res;
    }
    public static void main(String[] args) {
        int te = in.nextInt();
        ArrayList<Long> a = init();
        Collections.sort(a);
        while(te-- > 0){
            int n = in.nextInt();
            for(long x : a) {
                if(x % n == 0){
                    System.out.println(x); break;
                }
            }
        }
    }
}