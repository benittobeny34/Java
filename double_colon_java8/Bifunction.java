
package double_colon_java8;

/**
 *
 * @author Benitto Raj
 */
//import java.util.function.BiFunction;
import java.util.function.BiFunction;

public class Bifunction {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> bi = (Integer i, Integer j) -> {
            int square1 = i * i;
            int square2 = j * j;
            int result = square1 + square2;
            return "The result is:" + result;
        };
        String value = bi.apply(3, 2);
        System.out.println("The value is:" + value);

        BiFunction<String, String, Integer> bi1 = (String s1, String s2) -> {
            int l1 = s1.length();
            int l2 = s2.length();
            int len = l1 + l2;
            return len;
        };
        int ans = bi1.apply("Benitto", "Feproniya");
        System.out.println("The length of the two string is" + ans);

    }
}
