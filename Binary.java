import java.util.*;
class Binary
{
public static void main(String[] args)
{
int reversed;
System.out.println("Enter the number:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(Integer.toBinaryString(n));
System.out.println(Integer.toOctalString(n));
System.out.println(Integer.toHexString(n));
}
}