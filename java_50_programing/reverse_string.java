package java_50_programing;

public class reverse_string
{
    public static void main(String arr[])
    {
        String s;
       // Scanner input = new Scanner(System.in);
       // s=input.nextLine();
        StringBuilder str 
            = new StringBuilder("WelcomeGeeks"); 
        int len = str.length();
        System.out.println("The original Stirng is:"+str);
        System.out.println(len);
      str=  str.reverse();
//        for(int i=len-1;i>=0 ; i--)//without using StringBuilder function
//        {
//            System.out.print(s.charAt(i));//charAt(i) small c and A letters are more important;
//        }
          System.out.print("The reverse stirng is:");
         System.out.print(str);//we can use also str.toString() method
    }
}
