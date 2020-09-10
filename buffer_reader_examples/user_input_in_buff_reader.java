
package buffer_reader_examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class user_input_in_buff_reader
{
    public static void main(String arr[]) throws Exception
    {
        InputStreamReader is= new InputStreamReader(System.in);
     BufferedReader input = new BufferedReader(is); 
String s=input.readLine();  
     //int n= i;//
        System.out.println(s);
    }
}
