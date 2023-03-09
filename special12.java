import java.util.*;
class special12
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the String:");
String str=sc.nextLine();
char[] ch=str.toCharArray();
int d=str.length();
int alph=0,dig=0,sp=0;
String str1=str.toLowerCase();
for(int i=0;i<d;i++)
{
ch[i]=str1.charAt(i);
}
for(int i=0;i<d;i++)
{
if(ch[i]>='a'&&ch[i]<='z')
{
alph++;
}
else if(ch[i]>='0'&&ch[i]<='9')
{
dig++;
}
else
{
System.out.print(ch[i]);
System.out.println();
sp++;
}
}
System.out.println("no of special characters:"+sp);
}
}