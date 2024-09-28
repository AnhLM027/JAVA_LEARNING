package Code_PTIT_AnhLM027;


import java.util.*;

public class J04022 {
    static Scanner in = new Scanner(System.in);
    
    
    
    static class WordSet{
        String[] a;
        
        WordSet(String a){
            this.a = a.toLowerCase().trim().split("\\s+");
        }
        
        public WordSet union(WordSet b){
            TreeSet<String> se = new TreeSet<>();
            for (int i = 0; i < this.a.length; i++) se.add(a[i]);
            for (int i = 0; i < b.a.length; i++) se.add(b.a[i]);
            String ans = "";
            for(String x : se) ans += x + " ";
            return new WordSet(ans);
        }
        
        public WordSet intersection(WordSet b){
            TreeSet<String> se = new TreeSet<>();
            for (int i = 0; i < this.a.length; i++) se.add(a[i]);
            TreeSet<String> se2 = new TreeSet<>();
            for (int i = 0; i < b.a.length; i++) {
                if(se.contains(b.a[i])) se2.add(b.a[i]);
            }
            String ans = "";
            for(String x : se2) ans += x + " "; 
            return new WordSet(ans);
        }

        @Override
        public String toString() {
            String tmp = "";
            for (int i = 0; i < this.a.length; i++) {
                tmp+= a[i] + " ";
            }
            return tmp;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
