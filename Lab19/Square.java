//Evelyn Sun
//115417946


public class Square extends GeometricObject implements Colorable {
	private double sideLength;
	public Square(String color, boolean filled, double sideLength) {
		super(color, filled);
		this.sideLength=sideLength;
	}
	@Override
	public double getArea() {
		return sideLength*sideLength;
	}
	public double getPerimeter() {
		return 4*sideLength;
	}
	@Override
	public void howToColor() {
		System.out.println(super.isFilled()?"Color the whole square":"Color only the border");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject s1 = new Square("Blue",true,4);
		GeometricObject s2 = new Square("Red",false,5);
		Square s3 = new Square("Pink",true,6);
		Square s4 = new Square("Ornage",true,7);
		Square s5 = new Square("Green",true,8);
		GeometricObject[]arr = {s1,s2,s3,s4,s5};
		
		for (GeometricObject g:arr) {
			if (g instanceof Colorable) {
				((Colorable)g).howToColor();
			}
		}
		

	}

}
