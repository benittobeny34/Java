
package Own_programs;

import static java.lang.Math.abs;
import java.util.Scanner;

/*

STEP NUMBER ;;
  The step number means the adjancent numbers difference must be equal to one . if it is not then it is called normal number

*/
public class step_number_zoho 
{
    public static void main(String ...args){
        int n,i=0,j;
        Scanner s =new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[100000];
        while(n>0){              // 5 4 3 2 4 3
            a[++i]=n%10;         // 1 2 3 4 5 6
            n /= 10;      
        }
        for(j=i-1;j>=1;--j){
            if(abs(a[j]-a[j+1])!=1)
            {
                System.out.println(a[j]+" "+a[j+1]);
                System.out.println("NO");
               System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}
