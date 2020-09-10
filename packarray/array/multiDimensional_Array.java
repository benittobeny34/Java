package packarray.array;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */
public class multiDimensional_Array {
    public static void main(String arr[])
    {
        int a[]=new int[5];
        int b[][]=new int[5][5];
        int c[][][]=new int [5][5][5];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<4;k++)
                    c[i][j][k]=i+j+k;
            }
        }
    
   for(int i[][]:c)
        {
            for(int j[]:i)
            {
                for(int k:j)
                    System.out.print(" "+k);
            }
        }
    }
}
