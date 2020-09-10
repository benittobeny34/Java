package zoho_practice;

/**
 *
  @author Benitto Raj
 */
public class inc_dec_2 {

    public static void main(String args[]) {
        int x = 10, y = 5, z;
        z = --x + y-- + x-- + --x - --y; //left to right --->each variable executes and then move to the next variable value;
        System.out.println(x + " " + y + " " + z);
        int k = --z - ++y + --x - --z;
        System.out.println(x + " " + y + " " + z + " " + k);

    }
}
