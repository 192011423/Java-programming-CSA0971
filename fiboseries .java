import java.util.*;
import java.util.Scanner;
class fiboseries {
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.print("Enter the n value: ");
int n=input.nextInt();
int a1=0,a2=1;
for(int i=0;i<n;i++)
{
 System.out.print(a1+" ");
 int a3=a1+a2;
 a1=a2;
 a2=a3;
}
}}