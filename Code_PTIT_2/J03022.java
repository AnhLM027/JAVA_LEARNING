package Code_PTIT_2;


import java.util.*;


public class J03022 {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        while(in.hasNext()) {
            String s = in.next().toLowerCase();
            //if(s.equals("ok")) break;
            a.add(s);
        }
        String ans = "";
        for (int i = 0; i < a.size(); i++) {
            ans += a.get(i) + " ";
        }
        char[] tmp = ans.toCharArray();
        for (int i = 0; i < tmp.length; i++) {
            if (i == 0) {
                tmp[i] = Character.toUpperCase(tmp[i]);
            }
            else if (i >= 1 && i + 1 < tmp.length && (tmp[i - 1] == '.' || tmp[i - 1] == '?' || tmp[i - 1] == '!')) {
                tmp[i] = '\n';
                tmp[i + 1] = Character.toUpperCase(tmp[i + 1]);
            }
            else if (tmp[i] == '.' || tmp[i] == '?' || tmp[i] == '!') {
                continue;
            }
            System.out.print(tmp[i]);
	}
    }
}