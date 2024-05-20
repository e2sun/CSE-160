//Evelyn Sun
//115417946

public class Rectangle {
	private double width;
	private double height;
	private String color;
	public Rectangle() {
		width=1;
		height=1;
		color="white";
	}
	public Rectangle(double w, double h, String s) {
		width=w;
		height=h;
		color=s;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public String getColor() {
		return color;
	}
	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return width+height+width+height;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle one = new Rectangle(4, 40,"red");
		Rectangle two = new Rectangle(3.5, 35.9,"red");
		
		System.out.println("The width and height of the " + one.getColor() + " rectangle one is " + one.getWidth() + " X " + one.getHeight());
		System.out.println("The area is " + one.getArea() + " and the perimeter is " + one.getPerimeter());
		
		System.out.println();
		
		System.out.println("The width and height of the " + two.getColor() + " rectangle two is " + two.getWidth() + " X " + two.getHeight());
		System.out.println("The area is " + two.getArea() + " and the perimeter is " + two.getPerimeter());
		
		

	}

}
