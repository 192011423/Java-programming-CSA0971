import java.util.*;
import java.util.Scanner;
class multiplicationtable {
public static void main(String[] args)
{
try
{
Scanner input=new Scanner(System.in);
System.out.print("Enter M: ");
int M=input.nextInt();
System.out.print("Enter N: ");
int N=input.nextInt();
for(int i=1;i<=N;i++) 
{     
System.out.println(i+"x"+M+"="+(i*M)); 
}
}
catch(Exception e)
{
System.out.println(" enter valid");
}
}}