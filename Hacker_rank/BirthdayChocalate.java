/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hacker_rank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class BirthdayChocalate {
    static int birthday(List<Integer> s, int d, int m,int n) 
    {
        int count=0,sum;
      for(int i=0;i<=n-m;i++)
      {
          sum = 0;
          for(int j=i;j<i+m;j++)
          {
          sum+=s.get(j);
          }
          if(sum==d) count++;
      }
      return count;
    }

    public static void main(String[] args) throws IOException {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       //see the code in the hacker rank birthday choclate problem solving 
       //jsut read the values from the console
    }
    
}
