
public class replace_methods_demos
{
   public static void main(String args[])
   {
       String one = new String("this is demo this string :");
       String two = new String ("welcome to the replace demo");
       System.out.println("replace o for i in String one: "+one.replace("i","o"));
       System.out.println("replace  i for o in String two:"+two.replace("o","i"));
       System.out.println("Replace first substring of string one:"+one.replaceFirst("this","there"));
   }
}
