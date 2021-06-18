class fig
{
	int l,b ;
	double area()
	{
		System.out.println("invalid area");
		return 0;
	}

}


class rectangle extends fig
{
	
	rectangle(int x,int y) {
		l=x;
		b=y;
	}
	double area()
	{
		return l*b ;
	}
}

class triangle extends fig {
	int a;
	triangle (int u,int v){
	l=u;
	b=v;
	}
	double area()
	{
		return (float)1/2*l*b;
	}
}

class prog10 {
	public static void main(String args[]) {
		rectangle m=new rectangle(500,80);
		triangle n=new triangle(500,80);
		System.out.println("Area of rectangle is :"+m.area());
		System.out.println("Area of triangle is :"+n.area());}}





