class fraction
{
	int num,den;

	fraction()
	{

	}

	fraction(int x)
	{
	num=1;
	den=1;
	try{
	double x1=num/den;
	}catch(ArithmeticException e){
	num=0;
	den=1;}
	}

	fraction(int x,int y)
	{
	num=x;
	den=y;
	try{
	double x1=num/den;
	}catch(ArithmeticException e){
	num=0;
	den=1;}
	}


	fraction addition(fraction x) {
	fraction f=new fraction();
	f.num=x.den*this.num+this.den*x.num;
	f.den=this.den*x.den;
	try{
	double x1=f.num/f.den;
	}catch(ArithmeticException e){
	f.num=0;
	f.den=1;}
	return f;
	}
	
	fraction subtraction(fraction x) {
	fraction f=new fraction();
	f.num=x.den*this.num-this.den*x.num;
	f.den=this.den*x.den;
	try{
	double x1=f.num/f.den;
	}catch(ArithmeticException e){
	f.num=0;
	f.den=1;}
	return f;
	}
	
	fraction multiplication(fraction x) {
	fraction f=new fraction();
	f.num=this.num*x.num;
	f.den=this.den*x.den;
	try{
	double x1=f.num/f.den;
	}catch(ArithmeticException e){
	num=0;
	den=1;}
	return f;
	}

	fraction division(fraction x) {
	fraction f=new fraction();
	f.num=x.den*this.num;
	f.den=this.den*x.num;
	try{
	double x1=f.num/f.den;
	}catch(ArithmeticException e){
	num=0;
	den=1;}
	return f;
	}

	void display(){
	System.out.println("The fraction is: "+this.num+"/"+this.den);}
	




	public static void main (String args[])
	{
	fraction f3=new fraction();
	fraction f4=new fraction();
	fraction f5=new fraction();
	fraction f6=new fraction();
	
	
	fraction f1=new fraction(2,3);
	fraction f2=new fraction(5);
	
	f3=f1.addition(f2);
	f3.display();
	
	f4=f1.subtraction(f2);
	f4.display();

	f5=f1.multiplication(f2);
	f5.display();
	
	f6=f1.division(f2);
	f6.display();
	}
}

