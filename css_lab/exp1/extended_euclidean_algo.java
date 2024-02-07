// import java.util.*;
// import java.

import java.util.Scanner;

class exp1 {
    public static void main(String ... args) {
        System.out.println("Enter a & b : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        // a =161, b =28
        // r1 = 7, s1 = -1, t1 = 6

        int r1=a, r2=b;
        int q=-1, r=-1;
        int s1=1, s2=0, t1=0, t2=1;
        int s=-1, t=-1;

        while(r2 != 0) {
            // step 1
            q = r1 / r2;
            r = r1 % r2;

            r1 = r2;
            r2 = r;

            // step 2
            s = s1 - q * s2;
            
            s1 = s2;
            s2 = s;
            
            // step 3
            t = t1 - q * t2;
            
            t1 = t2;
            t2 = t;

        }

        System.out.println();
        System.out.println("r1 = " + r1);
        System.out.println("s1 = " + s1);
        System.out.println("t1 = " + t1);
    }
}
