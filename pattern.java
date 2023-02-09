import java.util.*;
public class pattern  
{   
public static void main(String args[])   
{   
  Scanner s1 =new Scanner(System.in);
  System.out.println("input :-");
  int row = s1.nextInt();  
int i, j;   

for(i=0; i<row; i++)   
{   
for(j=0; j<=i; j++)   
{     
System.out.print("* ");   
}    
System.out.println();   
}   
}   
            }
