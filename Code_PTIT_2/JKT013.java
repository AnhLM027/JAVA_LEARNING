package Code_PTIT_2;

import java.util.*;


public class JKT013 {
    static Scanner in = new Scanner(System.in);
    
    static long[] dp = new long[10000];
    static ArrayList<Long> init (){
        Queue<Long> qe = new LinkedList<>();
        qe.add(6L);
        qe.add(8L);
        ArrayList<Long> res = new ArrayList<>();
        while(!qe.isEmpty()){
            long tmp = qe.peek(); qe.poll();
            if(tmp > 1e16) break;
            res.add(tmp);
            qe.add(tmp * 10 + 6);
            qe.add(tmp * 10 + 8);
        }
        for(long x : qe) res.add(x);
        return res;
    }
    public static void main(String[] args) {
        int te = in.nextInt();
        ArrayList<Long> a = init();
        while(te-- > 0){
            int n = in.nextInt();
            long tmp = (long)Math.pow(10, n);
            Stack<Long> b = new Stack();
            for (int i = 0; a.get(i) < tmp; i++) {
                b.push(a.get(i));
            }
            System.out.println(b.size());
            while(!b.empty()) {
                System.out.print(b.peek() + " "); b.pop();
            }
            System.out.println("");
        }
    }
}
