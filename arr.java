import java.util.*;
class arr{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the array size:");
int n=sc.nextInt();
int arr[]=new int[100];
System.out.println("array:");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
System.out.println(arr[i]+" ");
System.out.println(arr[i]*arr[i]+" ");
}
System.out.println();
}
}

