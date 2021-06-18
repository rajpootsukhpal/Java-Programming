import java.util.*;
public class prog1 {
public static void main (String args[] ) {
int gr=0;
Scanner sc=new Scanner (System.in);
System.out.println("how many number you want to enter? ");
int m=sc.nextInt();
int num[]=new int[m];
System.out.println("enter "+m+" natural numbers ");
for(int i=0;i<m;i++)
{num[i]=sc.nextInt();}
for(int i=0;i<m;i++){
if(num[i]>gr){
gr=num[i];}
}
System.out.println("largest number is " +gr);
}}
