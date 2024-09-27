package Code_PTIT_2;


import java.util.*;


public class J08025 {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t = in.nextInt();
        while(t-- > 0) {
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            for (int i = 0; i < 6; i++) {
                a.add(in.nextInt());
            }
            for (int i = 0; i < 6; i++) {
                b.add(in.nextInt());
            }
            int ans = -1;
            Queue<Map.Entry<ArrayList<Integer>, Integer>> qe = new LinkedList<>();
            qe.add(new AbstractMap.SimpleEntry<>(a, 0));
            Set<ArrayList<Integer>> se = new HashSet<>();
            while(!qe.isEmpty()) {
                Map.Entry<ArrayList<Integer>, Integer> top = qe.peek(); qe.poll();
                ArrayList<Integer> ok = top.getKey();
                if(ok.equals(b)) {
                    ans = top.getValue();
                    break;
                }
                ArrayList<Integer> s1 = new ArrayList<>(ok);
                int tmp1 = s1.get(0);
                s1.set(0, s1.get(3));
                s1.set(3, s1.get(4));
                s1.set(4, s1.get(1));
                s1.set(1, tmp1);
                if(!se.contains(s1)) {
                    se.add(s1);
                    qe.add(new AbstractMap.SimpleEntry<>(s1, top.getValue() + 1 ));
                }
                ArrayList<Integer> s2 = new ArrayList<>(ok);
                int tmp2 = s2.get(1);
                s2.set(1, s2.get(4));
                s2.set(4, s2.get(5));
                s2.set(5, s2.get(2));
                s2.set(2, tmp2);
                if(!se.contains(s2)) {
                    se.add(s2);
                    qe.add(new AbstractMap.SimpleEntry<>(s2, top.getValue() + 1));
                }
            }
            System.out.println(ans);
        }
    }
}