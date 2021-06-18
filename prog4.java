import java.util.*;
public class prog4{
int n;
public static void main (String args[]){
Scanner sc=new Scanner (System.in);
prog4 obj=new prog4();
System.out.println("enter number");
obj.n = sc.nextInt();
System.out.println("sum of digits of "+obj.n+" is "+obj.sum());
System.out.println("product of digits of "+obj.n+" is "+obj.product());
System.out.println("reverse of digits of "+obj.n+" is "+obj.reverse());
System.out.println(obj.n+" is armstrong= " +obj.armstrong());
}

int sum(){
int rem1,m1=n,sum1=0;
while (m1>0){
rem1=m1%10;
sum1=sum1+rem1;
m1=m1/10;}
return sum1;}

int product(){
int rem2,m2=n,product2=1;
while (m2>0){
rem2=m2%10;
product2=product2*rem2;
m2=m2/10;}
return product2;}

int reverse(){
int rem3,m3=n,newnum=0;
while (m3>0){
rem3=m3%10;
newnum=newnum*10+rem3;
m3=m3/10;}
return newnum;}

boolean armstrong(){
int rem4,m4=n,sum4=0;
while (m4>0){
rem4=m4%10;
sum4=sum4+rem4*rem4*rem4;
m4=m4/10;}
if(sum4==n)
{return true;}
else
{return false;}
}
}
