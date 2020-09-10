package file_demo;


 import java.io.*;
public class file_openANDclose {
    public static void main(String arr[]) throws Exception
    {  int i;
        char c;
        byte[] bs=new byte[5];
       FileInputStream fis=null;
       FileOutputStream fos=null;
        File f1=new File("DEmo.txt");
        File f2=new File("demo2.txt");
        
        try{
      while(true){
         fis=new FileInputStream(f1);
         fos=new FileOutputStream(f2);
      
        i=fis.available();
            System.out.println("The total bytes available in f1 is:"+i);
            fis.read(bs);
           //while((i=fis.read(bs))!=-1)
           for(byte j:bs)
            {
                c=(char)j;
                fos.write(c); 
            }
             fis.close();
           fos.close();
           break;
      }//while close 
        }//try close
         
        catch(FileNotFoundException ae){
            System.out.println("enter the valid name document:");
            
        }//cattch end
   
        
          
       
    //finally close
 
    
    }
    
}
