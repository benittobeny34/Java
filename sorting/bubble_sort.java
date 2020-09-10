
package sorting;

public class bubble_sort
{
    public static void main(String arr[])
    {
        int a[]= {10,20,50,9,3,100};
        int  temp;
        String  s="beni";
        int l=s.length();//it is used to find out string length like a method(s.length())
        for(int  i=0;i<a.length;i++)//it is used to find out the array length like a variable(a.length);
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
           
        }
         System.out.println("The sorted array is:");
            for(int i=0;i<a.length;i++)
            {
                System.out.println(a[i]);
            }
    }
    
}
