//Evelyn Sun
//115417946

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		side1=1.0;
		side2=1.0;
		side3=1.0;
	}
	public Triangle(double s1, double s2, double s3) {
		side1=s1;
		side2=s2;
		side3=s3;
	}
	public Triangle(double s1, double s2, double s3, String color, boolean filled) {
		super(color,filled);
		side1=s1;
		side2=s2;
		side3=s3;
		//super(color,filled);
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea() {
		double s = (side1+side2+side3)/2;
		double area = s*(s-side1)*(s-side2)*(s-side3);
		area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
		
	}
	public double getPerimeter() {
		return side1+side2+side3;
	}
	public String toString() {
		String area = "Area: " + this.getArea() + "\n";
		String perimeter = "Perimeter: " + this.getPerimeter() + "\n";
		String color = "Color: " + this.getColor() + "\n";
		String filled = "Filled: " + this.isFilled() + "\n";
		return area + perimeter + color + filled;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle one = new Triangle(1, 1.5, 1, "yellow", true);
		System.out.println(one.toString());

	}

}
