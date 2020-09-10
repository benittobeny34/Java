import java.util.*;
import java.io.*;
public class Hacker_rank_hashmap
{
	public static void main(String []argh)
	{
      
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        HashMap<String,Integer> map = new HashMap<String,Integer>(n);
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            map.put(name, phone);
			in.nextLine();
            
		}
            System.out.println("The output of the given input is gien below:");
		while(in.hasNext())
		{
			String s=in.nextLine();
            boolean result=map.containsKey(s);
            if(result)
            {
              System.out.println(s+"="+map.get(s));
            }
            else 
            {
                System.out.println("Not found");
            }
		}
	}
}

/*3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry*/

