import java.util.*;
 class valid 
 {
   public static void main(String args[])
   { 
     Scanner s1=new Scanner(System.in);
     System.out.println("enter the username");
     String s = s1.nextLine();
     System.out.println("enter other username");
     String g = s1.nextLine();
     if(s.equals(g) == true)
     {
       System.out.println("User name is valid");
     }
     else{
       System.out.println("User name is Invalid");
     }
   }
 }