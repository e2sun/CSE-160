//Evelyn Sun
//115417946

public class Circle2D {
	private double x;
	private double y;
	private double radius;
	
	public Circle2D() {
		x=0;
		y=0;
		radius=1;
	}
	public Circle2D(double x1, double y1, double r) {
		x=x1;
		y=y1;
		radius=r;
		
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	public boolean contains(double x1, double y1) {
		if ((y1-y)/(x1-x)<=radius) {
			return true;
		}
		return false;
	
	}
	public boolean contains(Circle2D circle) {
		if ((circle.getX()-x)/(circle.getY()-y)+circle.getRadius()<=radius) {
			return true;
		}
		return false;
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2D c1 = new Circle2D(2,2,5.5);
		System.out.println("The area of the circle is " + c1.getArea());
		System.out.println("The Perimeter of the circle is " + c1.getPerimeter());
		System.out.println(c1.contains(3,3));
		System.out.println(c1.contains(new Circle2D(4,5,10.5)));
		
		 
	

	}

}
