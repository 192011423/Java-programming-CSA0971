import java.util.*;
import java.util.Scanner; 
import java.lang.Math; 
public class sqroot {     
public static void main(String args[])     
{  
      try
      {       
           Scanner input=new Scanner(System.in);
           System.out.print("Enter the number:");         
           double n=input.nextInt();         
           double sqrt=Math.pow(n,0.5);         
           double sq=Math.sqrt(n);         
           System.out.println("Square root of perfect number is:"+sqrt+","+"-"+sqrt);
      }
      catch(Exception e)
      {
      System.out.println(" enter valid");
      }
}}