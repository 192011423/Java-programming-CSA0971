import java.util.Scanner;
public class interest
{
    public static void main(String args[]) 
    {
        float p,r,t,sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = scan.nextFloat();
        System.out.print("Enter the years: ");
        r = scan.nextFloat();
        System.out.print(" is customer senior citizen:Y");
        System.out.print(" is customer senior citizen:N");
        t=scan.next Float();
        scan.close();
        sinterest = (p * r * t) / 100;
        System.out.print("Simple Interest is:"+sinterest);
    }
}
