/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;


public class insertion_sort 
{
    public static void main(String arr[])
    {
        int a[]={9,3,2};
        int l=a.length;
        System.out.println(l);
        int i,key;
        int  j;
        for(i=1;i<l;++i)
        {
            key=a[i];
            j=i-1;
            System.out.println("j values is"+j);
            while(  j>=0&&key<a[j] )
            {
                a[j+1]=a[j];
                //System.out.println(a[j+1]);
                j=j-1;
                //System.out.println("next j values is:"+j);
            }
            a[j+1]=key;
        }
        for( i=0;i<l-1;i++)
        {
            System.out.println(a[i]);
        }
    }
}
