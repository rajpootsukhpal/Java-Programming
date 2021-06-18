import java.util.*;
class prog5 {
public static void main (String args[] ) {
Scanner sc=new Scanner (System.in);
int num[]=new int[10];
int c1=0,c2=0,c3=0;
System.out.println("enter 10 numbers for array");
for(int i=0;i<10;i++)
{num[i]=sc.nextInt();}
System.out.println("enter number");
int n=sc.nextInt();
for(int i=0;i<10;i++){
if(num[i]>n){
c1++;}
else if(num[i]<n){
c2++;}
else{
c3++;}}
System.out.println(c1+" number is greater than "+n);
System.out.println(c2+" number is less than "+n);
System.out.println(c3+" number is equal "+n);
}
}
