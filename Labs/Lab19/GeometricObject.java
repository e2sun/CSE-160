//Evelyn Sun
//115417946


public abstract class GeometricObject  implements Comparable, Cloneable{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();
	
	@Override
	public int compareTo(Object o) {
		if (((GeometricObject)o).getArea()>this.getArea()) {
			return -1;
		}else if (((GeometricObject)o).getArea()<this.getArea()) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	@Override
	public Object clone() {
		try {
			GeometricObject g = (GeometricObject)super.clone();
			g.dateCreated = (java.util.Date)(this.dateCreated.clone());
			return g;
		} catch (Exception e) {
			System.out.println("An exception in clone()");
		}
		return null;
		
	}
	public static GeometricObject max(GeometricObject g1, GeometricObject g2) {
		return (g1.compareTo(g2)>=0)?g1:g2;
		}
	
	public static void main(String args[]) {
		GeometricObject[]circles = new GeometricObject[10];
		double random;
		for (int i=0;i<circles.length;i++) {
			random=Math.random()*50;
			circles[i]=new Circle(random);
			System.out.println("Circle " + (i+1) + "'s area: " + circles[i].getArea());
		}
		GeometricObject max = circles[0];
		for (int i=1;i<circles.length;i++) {
			max=GeometricObject.max(max, circles[i]);
		}
		System.out.println("The largest circle has the area of: " + max.getArea());
		System.out.println();
		GeometricObject[]rec = new GeometricObject[10];
		double random2;
		for (int i=0;i<rec.length;i++) {
			random=Math.random()*50;
			random2 = Math.random()*50;
			rec[i]=new Rectangle(random,random2);
			System.out.println("Rectangle: " + (i+1) + "'s area: " + rec[i].getArea());
		}
		max=rec[0];
		for (int i=1;i<rec.length;i++) {
			max=GeometricObject.max(max, rec[i]);
			
		}
		System.out.println("The largest rectangle has the area of: " + max.getArea());
		System.out.println();
		
		GeometricObject r1 = new Rectangle(2,3);
		GeometricObject r2 = (GeometricObject) r1.clone();
		System.out.println(r1==r2);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println();
		
		GeometricObject c1 = new Circle(5);
		GeometricObject c2 = (GeometricObject) c1.clone();
		System.out.println(c1==c2);
		System.out.println(c1);
		System.out.println(c2);
		
	}
}