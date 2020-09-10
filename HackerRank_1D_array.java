/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Benitto Raj
 */
import java.util.*;
public class HackerRank_1D_array 
{
    


    public static boolean canWin(int leap, int[] game) {
        
        int i=0;
    
        while(true){
            try{
             if(game[i+leap]==0)
                {
                i=i+5;
                }
             else if(game[i+1]==0)
             {
                 i++;
             }
             else if(game[i-1]==0)
             {
                 i--;
             }
             else 
             {
                 return false;
             }
             if(i>game.length) return true;
            }//try end
            catch(Exception e){}
        }//while end
       
        // Return true if you can win the game; otherwise, return false.
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}



