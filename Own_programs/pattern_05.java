package Own_programs;

import java.util.Scanner;

/**
 *
 * @author Benitto Raj
 */
public class pattern_05 {

    final static Scanner s = new Scanner(System.in);

    public static void main(String... args) {
        int n = s.nextInt();   
        int a = n;
        int k = n;
        for (int i = 0; i <= n; i++, k--) {
            for (int j = 0; j <= n; j++) {
                if (i == j || k == j) {

                    System.out.print(a);
                } else {
                    System.out.print(" ");
                }
            }
            a--;
            System.out.println();
        }
        s.close();
    }

}
