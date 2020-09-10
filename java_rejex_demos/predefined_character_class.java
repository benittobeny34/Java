
package java_rejex_demos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class predefined_character_class 
{

  //special predefined functions are 
//[\\s] -------> it means spaces 
// [\\S]---> captial S means except space characters
//[\\w] -----> All the world characters 
//[\\W] -------> captial W means except all the word characters
//[//d]------> any didit values
//[//D]---> capital D means except digit values
// . ---- > dot means all thhe characters    
    // these are the predefined methods to use in rejex class
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("\\W");
        Matcher m = p.matcher("a# %A@ 35a3q|M? 5bz|E#b");
        while(m.find())
        {
            System.out.println("The starting index is:"+m.start()+" The group matchi is:"+m.group());
        }
    }
   
}
