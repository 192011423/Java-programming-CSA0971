import java.util.*;
import java.util.Scanner;
class digitsum {
public static void main(String[] args)
{
      try
      {
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the number:"); 
            int n=input.nextInt(); 
            int sum=0; 
            while(n!=0) 
            {     
            int rem=n%10;     
            sum=sum+rem;     
            n=n/10; 
            } 
            System.out.print("Sum is:"+sum);
      }
      catch(Exception e)
      {
      System.out.println(" enter valid");
      }
}}


