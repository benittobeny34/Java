import java.util.Random;
public class RANDOM_CLASS {
    public static void main(String arr[])
    {
        Random r=new Random();
        int a[]=new int[50];
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt(100);
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        
    }
    
}
