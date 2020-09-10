import java.lang.Math;
public class perfect_squres 
{
    public static void main(String args[]){
        int i,count;
        double c,x;
        System.out.println("Pefect squres from 1 to 500\n");
        count = 0;
        for(i=1;i<=500;i++){
            c=Math.sqrt(i);
            x=Math.floor(c);
            if (x==c)
            {
                System.out.print(i+"\t");
                count++;   
            }
            
        }
        System.out.println("The total pefect squres between 1 to 500 is:"+count);
    }
}
