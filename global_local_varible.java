


/**
 *
 * @author Benitto Raj
 */
class Date_check{
    int a=4;//global variable
    public void increase(){
        a++;
        System.out.println("The value of a is:"+a);
    }
    public void up(){
     
        System.out.println("The vaue of a is:"+a++);
        
    }
    public void decrease()
    {
        int a = 10; //local variable 
        a--;
       
        System.out.println("The value of a in decrease method:"+a);
    }
}
public class global_local_varible 
{
    
    public static void main(String[] args) 
    {
     
        Date_check d =new Date_check();
        d.increase();
        d.up();
        d.increase();
        d.up();
        d.decrease();
    }
   
}
