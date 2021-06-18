class areas {
	void area (float x) {
	System.out.println("Area of square is : "+(x*x)+"square units");}

	void area (float x,float y) {
	System.out.println("Area of rectangle is : "+(x*y)+"square units");}

	void area (double r,double h) {
	System.out.println("Area of cylinder is : "+(2*3.14*r*(r+h))+"square units");}

}
public class prog9 {
public static void main (String args[]) {
areas ar=new areas();
ar.area(10);
ar.area(15.0,20.0);
ar.area(15.00,20.00);
}
}

