 import java.util.Scanner;
public class Evenodd {
    public static void main(String arr[])
    {
        int n;
        String m;
        
        Scanner s=new Scanner (System.in);
        n=s.nextInt();
        m=s.next();
        
        if(n%2==1)
        {
            System.out.println("odd");
        }
        else
            System.out.println("even");
        System.out.println(m);
    }
    
}
