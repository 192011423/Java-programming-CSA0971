import java.util.Scanner;
class bintodecoct {
public static void main(String[] args)
{
try
{
Scanner input=new Scanner(System.in);
System.out.print("Enter the number: ");  
String bin=input.nextLine();  
int dec=Integer.parseInt(bin,2);  
System.out.println("Decimal: "+dec);  
String oct=Integer.toOctalString(dec);  
System.out.println("Octal: "+oct);
}
catch(Exception e)
{
System.out.println(" enter valid");
}
}}