
public class Triangle {
	private double side1, side2, side3;
	
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
		if (side1+side2<=side3||side2+side3<=side1||side3+side1<=side2) {
			throw new IllegalTriangleException(side1,side2,side3);
		}
		else {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Triangle t1 = new Triangle(1,3,1);
		try {
			Triangle t1 = new Triangle(1,3,1);
			System.out.println("Triangle Created");			
		}
		catch(IllegalTriangleException e) {
			e.printStackTrace();
			System.out.println("Triangle with sides " + e.getSide1() + ", " + e.getSide2() + ", " + e.getSide3() + " is invalid. No Triangle was created. " );
		
		
		}
		try {
			Triangle t2 = new Triangle(3,4,5);
			System.out.println("Triangle Created");			
		}
		catch(IllegalTriangleException e) {
			e.printStackTrace();//shows which functions are called
			System.out.println("Triangle with sides " + e.getSide1() + ", " + e.getSide2() + ", " + e.getSide3() + " is invalid. No Triangle was created. " );
		
		
		}
		
		
		
		

	}

}
