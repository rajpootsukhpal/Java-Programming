import java.util.*;
class prog7 {
public static void main (String args[] ) {
Scanner sc=new Scanner (System.in);
System.out.println("enter range of array");
int n=sc.nextInt();
int num[]=new int[n];
System.out.println("enter array's values ");
for(int i=0;i<n;i++)
{num[i]=sc.nextInt();}

for(int i=0;i<n;i++){
int temp=num[i];
int temp1=temp;
int sum=0,rem;
while (temp1>0){
rem=temp1%10;
sum=sum+rem*rem*rem;
temp1=temp1/10;}
if (temp==sum)
System.out.println(temp+" is armtrong");}
}
}
