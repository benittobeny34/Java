package packarray.array;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */import java.util.Scanner;
public class TWODIMENSIONARRAY {
    public static void main(String arr[])
    {
        int a[][]=new int[4][5];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
                a[i][j]=input.nextInt();
        }
        for( int i[]:a)//enhanced for loop for two dimensional array where i[]each rows and a denotes array
        {
            for(int j:i)//enhanced for loop where j denotes values which stored inside the i[] row
                System.out.print(j+" ");
            System.out.println();
        }
       
        
    }
    
}
