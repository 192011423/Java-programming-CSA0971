import java.util.Scanner;
class charstring {
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the string");
String str=input.nextLine();
System.out.println("Enter character: ");
char c=input.next().charAt(0);
char arr[]=new char[str.length()];
int len=str.length();
int x=0;
for(int i=0;i<len;i++)
{
 arr[i]=str.charAt(i);
 if(arr[i]==c)
 {
 System.out.println(c+" is found in string at index: "+(i+1));
 x=1;
 }
}
if(x==0)
 System.out.print("character not found");
}}
