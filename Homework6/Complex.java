//Evelyn Sun
//115417946
import java.util.Scanner;

public class Complex {
	private double realPart;
	private double imaginaryPart;
	
	public Complex() {
		realPart=0;
		imaginaryPart=0;
	}
	public Complex(double rP, double iP) {
		realPart=rP;
		imaginaryPart=iP;
	}
	public double getRealPart() {
		return realPart;
	}
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	public static Complex add(Complex c1, Complex c2) {
		double c3r =c1.getRealPart()+c2.getRealPart();
		double c3i = c1.getImaginaryPart()+c2.getImaginaryPart();
		return new Complex(c3r,c3i);
		
	
	}
	public static Complex subtract(Complex c1, Complex c2) {
		double c3r =c1.getRealPart()-c2.getRealPart();
		double c3i = c1.getImaginaryPart()-c2.getImaginaryPart();
		return new Complex(c3r,c3i);
		
	}
	public void print() {
		System.out.println("(" + realPart + ", " + imaginaryPart + ")");
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Kb = new Scanner(System.in);
		System.out.print("Enter the real part of the first complex number: ");
		double cr1 = Kb.nextDouble();
		System.out.print("Enter imaginary part of the first complex number: ");
		double ci1 = Kb.nextDouble();
		System.out.print("Enter the real part of the second complex number: ");
		double cr2 = Kb.nextDouble();
		System.out.print("Enter imaginary part of the second complex number: ");
		double ci2 = Kb.nextDouble();
		
		Complex c1 = new Complex(cr1,ci1);
		Complex c2 = new Complex(cr2,ci2);
		
		System.out.print("First complex number is ");
		c1.print();
		//System.out.println();
		System.out.print("Second complex number is ");
		c2.print();
		//System.out.println();
		System.out.print("Addition of the complex numbers is  ");
		add(c1,c2).print();
		//System.out.println();
		System.out.print("Subtraction of the complex numbers is  ");
		subtract(c1,c2).print();
		//System.out.println();
		
		
		
		
	}

}
