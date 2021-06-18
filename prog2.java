import java.util.*;
public class prog2
{
public static void main (String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("enter number ");
int n=sc.nextInt();
int rem=0;
for(int i=2;i<n;i++)
{
if(n%i==0)
{
rem++;
break;
}
}
if(rem==0)
{
System.out.println(n+" is prime");
}
else
{
System.out.println(n+" is not prime");
}
}
}
