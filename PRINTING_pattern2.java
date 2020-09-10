/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */
public class PRINTING_pattern2 {
    public static void main(String arr[])
    {
        int i,j;
        for(i=6;i>=1;i--)
        {
            for(j=1;j<=6;j++)
            {
                if(j>=i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    
}
