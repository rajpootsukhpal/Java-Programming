import java.util.*;
class prog3
{
	public static void main(String args[])
	{
		System.out.println("enter 1 for fibonacci series ");
		System.out.println("enter 2 for factorial ");
		System.out.println("enter 3 for odd even");
		System.out.println("enter 4 for palindrome");
		System.out.println("Enter your choice : ");
		Scanner sc = new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:	
				{
				int a=1,b=1,c=0;
				System.out.println("how many term you want to show?");
				int m=sc.nextInt();
				System.out.println(a);

				System.out.println(b);
				for(int i=1;i<m;i++)
				{
				c=a+b;
				a=b;
				b=c;
				System.out.println(c);
				}}
				break;
			case 2:
				{
				int a=1;
				System.out.println("enter number for factorial ");
				int n=sc.nextInt();
				for(int i=1;i<n;i++)
				{
				a=a*i;
				}
				System.out.println("factorial of "+n+" is "+a);
				}
				break;
			case 3:
				{
				int a=5,b=6;
				if(a%2==0)
				System.out.println("5 is even");
				else
				System.out.println("5 is odd");
				if(b%2==0)
				System.out.println("6 is even");
				else
				System.out.println("6 is odd");
				}
				break;
			case 4:
				{
				System.out.println("enter number ");
				int n=sc.nextInt();
				int sum=0,temp=n,rem;
				while(temp>0)
				{
				rem=temp%10;
				sum=rem*10+sum;
				temp=temp/10;
				}
				if(n==sum){
				System.out.println(n+"is palindrome");
				}
				else{
				System.out.println(n+"is not palindrome");
				}}
				
				break;			
		}
	}
}


