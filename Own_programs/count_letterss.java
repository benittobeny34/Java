/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Own_programs;

/**
 *
 * @author Benitto Raj
 */
public class count_letterss 
{
    public static void main(String[] args) {
        char arr[]="IamFromtaMilnadu".toCharArray();
        int x;
        int count[] = new int[26];    
        for(int i=0;i<arr.length;i++)
        {
            x=arr[i]>=97?1:0;
            int discard=(x==0)?(count[arr[i]-65]++) :(count[arr[i]-97]++);
        }
       
        for(int i=0;i<26;i++){
            x=count[i];
            if(x!=0)  System.out.println((char)(i+65)+">>>"+x);
        }
    }
}
