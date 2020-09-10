/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAULRAJ
 */import java.util.*;
public class ATM_programing
{
    public static void main(String arr[])
    {                                   //note your pincode is 9999
    long  amount=100000;
    long deposit,withdraw;
    int choice,pin=0;
    int i=1;
    char select;
    boolean k=true;
    Scanner input=new Scanner(System.in);
    
    while(i<5&&pin!=9999)
    {
        System.out.println("Enter the pin code:");
        pin=input.nextInt();
        ++i;
    }
    if(i==5) System.out.println("Too many attempts warning:");
    if(pin==9999)
    {
    do
    {
        System.out.println("welcome to atm programing!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("1.SELECT ONE FOR CHECK YOUR BALANCE:");
        System.out.println("2.SELECT TWO FOR WITHDRAW:");
        System.out.println("3.SELECT THREE FOR DEPOSIT:");
        System.out.println("4.exit:");
        choice=input.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("your balance amount is:"+amount);break;
            }
            case 2:
            {
                System.out.println("Enter the withdraw amount:");
                withdraw=input.nextLong();
                if(withdraw>(amount-500)) System.out.println("insufficent balance :");
                else{
                amount=amount-withdraw;
                System.out.println("Your remaining balance is:"+amount);}
                break;
            }
            case 3:
            {
                System.out.println("Enter the deposit amount:");
                deposit=input.nextLong();
                amount=amount+deposit;
                System.out.println("Your balance is:"+amount);
                break;
            }
            case 4:
            {
                System.out.println("Thank you for your coming.!!!");break;
            }
                  }//switch end
         System.out.println("Do you want another transcition selects yes='y' or No='n'");
            select=input.next().charAt(0);
            if(select=='y'||select=='Y') k=true;
            else k=false;
    }while(k);
    }//if close
        System.out.println("Thank you for your ATM serivice:");
    }
    
}
