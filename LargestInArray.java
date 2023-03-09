import java.util.*;  
public class LargestInArray
{  
public static int getLargest(int[] a, int total)
{  
Arrays.sort(a);  
return a[total-1];  
}  
public static void main(String args[]){  
int a[]={1,2,5,6,3,2};  
int b[]={44,66,99,77,33,22,55};  
Scanner sc=new Scanner(System.in);
int c =sc.nextInt();
System.out.println("Largest: "+getLargest(a,c));  
System.out.println("Largest: "+getLargest(b,c));  
}
}