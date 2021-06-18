public class Point {
  // Create a Point object from a coordinate pair
  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }
 
  // Create a Point object from another Point
  public Point(Point p) {
    x = p.x;
    y = p.y;
  }
 
  // Get the value of the x coordinate
  double getX() {
    return x;
  }
 
  // Get the value of the y coordinate
  double getY() {
    return y;
  }
 
  public String toString(){
    return x +","+y;
  }
 
  // Fields store the point coordinates
  private double x;
  private double y;
}

public class Rectangle {
  private Point topLeft;
  private Point bottomRight;
 
  // Constructors
  public Rectangle(double x1, double y1, double x2, double y2) {
    // Ensure topleft uses the smaller of x1,x2 and y1,y2
    // and topright uses the larger of x1,x2 and y1,y2
    topLeft = new Point(Math.min(x1,x2),Math.min(y1,y2));
    bottomRight = new Point(Math.max(x1,x2),Math.max(y1,y2));
  }
 
  public Rectangle(Point tl, Point br) {
    this(tl.getX(), tl.getY(), br.getX(), br.getY());
  }
 
  public Rectangle(Rectangle rect) {
    topLeft = new Point(rect.topLeft);
    bottomRight = new Point(rect.bottomRight);
  }
 
  // Methods to create a rectangle enclosing the current rectangle and the argument
  public Rectangle encloses(Rectangle rect) {
    // Return a new rectangle defined by the minimum x,y for to left and the and maximum x,y for bottom right
    return new Rectangle(Math.min(topLeft.getX(), rect.topLeft.getX()),
                         Math.min(topLeft.getY(), rect.topLeft.getY()),
                         Math.max(bottomRight.getX(), rect.bottomRight.getX()),
                         Math.max(bottomRight.getY(), rect.bottomRight.getY()));
 
  }
 
  public String toString()  {
    return "Rectangle: " + topLeft + " : " + bottomRight;
  }
}

public class TestRectangle {
  public static void main(String args[]) {
    Rectangle[] rects = new Rectangle[4];
    Rectangle enclosing;
 
    // Initialize the rectangles as arbitrary sizes and at arbitrary positions:
    for(int i = 0 ; i < rects.length ; ++i) {
      rects[i] = new Rectangle(Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100);
      System.out.print("Coords of rectangle " + i + " are: ");
      System.out.println(rects[i]);
    }
 
    // Initialize the enclosing rectangle to be first rectangle
    enclosing = rects[0];
 
    // Combine it with each the other rectangles in turn.
    // This will result in the rectangle that encloses them all.
    for(Rectangle rect : rects)  {
      enclosing = enclosing.encloses(rect);
    }
 
    System.out.println("\nCoords of Enclosing rectangle are ");
    System.out.println(enclosing);
  }
}
