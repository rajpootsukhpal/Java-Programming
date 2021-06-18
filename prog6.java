import java.util.*;
class prog6 {
public static void main (String args[] ) {
Scanner sc=new Scanner (System.in);
int num[]=new int[5];
System.out.println("enter 5 prices ");
for(int i=0;i<5;i++)
	{num[i]=sc.nextInt();}
int sum=0,avg;
for(int i=0;i<5;i++){
sum=sum+num[i];}
avg=sum/5;

for(int i=0;i<5;i++){
if(num[i]>avg){
System.out.println(num[i]+" is greater than the average of all 5 prices");}}
}
}
