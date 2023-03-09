import java.util.*;
class gcd
{
static int gcd(int a,int b){
if(b==0)
return a;
else
return gcd(b,a%b);
}
public static void main(String[] args)
{
int a=20,b=30,gcd value;
gcd value=gcd(a,b);
System.out.println("GCD="+gcd vlue));
System.out.println("LCM="+lcm(a,b,gcd value));
}
}
