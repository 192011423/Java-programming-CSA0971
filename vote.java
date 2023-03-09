import java.util.*;
class vote
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Eligibility");
System.out.println("Enter your age:");
int age=sc.nextInt();
if((age>11)&&(age<=100))
{
System.out.println("you are eligible for vote:");
}
else
{
System.out.println("you are not eligible for vote:");
}
}
}