import java.util.*;
import java.util.Scanner;
class armstrongnum
{
public static void main(String[] args)
{
try
{
Scanner input=new Scanner(System.in); 
System.out.print("enter a number:");
int n=input.nextInt(); 
int N=n; 
int a=0; 
while(N!=0) 
{ 
int rem=N%10; 
a=a+(rem*rem*rem); 
N=N/10; 
} 
if(n==a) 
System.out.print("Given number is Armstrong number");
else 
System.out.print("given number is Not an Armstrong");
}
catch(Exception e)
{
System.out.print(" enter valid");
}
}
}