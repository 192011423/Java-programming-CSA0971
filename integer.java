import java.util.*;
public class integer{  
public static void main(String args[]){  
Scanner sc=new Scanner (System.in);
String str;
int s;
System.out.println("enter the string:");
str=sc.nextLine();
s=Integer.parseInt(str);
System.out.println("after converting to integer:"+s); 
}
}