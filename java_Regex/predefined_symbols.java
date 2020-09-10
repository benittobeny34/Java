
package java_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class predefined_symbols
{
    public static void main(String arat[]){
   // Pattern p = Pattern.compile("[\\W]+"); // for non word characters
    Pattern  p = Pattern.compile("[\\w]+"); // for word characters
    Matcher m = p.matcher("3beni, mani 2arthu ,#@@ $ammu,5 df jl");
    //[\\D] for except digit
    //[\\d] only for digit 
    
    while(m.find()){
        System.out.println(m.group());
    }
    
   }
}
