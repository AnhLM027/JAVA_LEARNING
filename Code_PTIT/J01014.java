package Code_PTIT;

import java.util.Scanner;

public class J01014 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            t--;
            long n = in.nextLong();
            int i = 2;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    while (n % i == 0) {
                        n /= i;
                    }
                }
                i++;
            }
            if (n > 1) {
                System.out.println(n);
            } else {
                System.out.println(i);
            }
        }
    }

}
