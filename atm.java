import java.util.*;
import java.util.Scanner;
class atm {
public static void main(String[] args)
{
      try 
      {
            int balance=0;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the value of n1:");
            int n1=sc.nextInt();
            for(int i=1;i<=n1;i++)
            {
            System.out.print("denomination:");
            int d=sc.nextInt();
            System.out.println("Enter the number of notes");
            int n=sc.nextInt();
            balance+=d*n;
            }
            System.out.println("The balance is"+balance);
      }
      catch(Exception e)
      {
      System.out.println(" enter valid");
      }
}}
