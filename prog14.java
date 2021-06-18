import java.util.*;
public class prog14
{
public static void main (String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("enter first number ");
String astring=sc.next();
System.out.println("enter second number ");
String bstring=sc.next();
try{
int a=Integer.parseInt(astring);
}catch(NumberFormatException ex){ex.getMessage();}

try{
int b=Integer.parseInt(bstring);
}catch(NumberFormatException ex){ex.getMessage();}
}
}
