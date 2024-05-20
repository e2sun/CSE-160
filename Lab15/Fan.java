//Evelyn Sun
//115417946

public class Fan {
	static int SLOW = 1;
	static int MEDIUM = 2;
	static int FAST = 3;
	
	private int speed;
	private boolean isOn;
	private double radius;
	private String color;
	
	public Fan() {
		speed=SLOW;
		isOn=false;
		radius=5;
		color="blue";
	
	}
	public int getSpeed() {
		return speed;
	}
	public boolean isOn() {
		return isOn;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public void setSpeed(int s) {
		speed=s;
	}
	public void turnOn(boolean b) {
		isOn=b;
	}
	public void setRadius(double r) {
		radius=r;
	}
	public void setColor(String s) {
		color=s;
	}
	
	public String toString() {
		String s="";
		if (isOn()) {
			s="The speed of the fan is " + speed + ", the color of the fan is " + color +
					", and the radius of the fan is " + radius;
			
		}
		else {
			s="The color of the fan is " + color + ", the radius of the fan is " 
					+ radius + ", and the fan is off";
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fan one = new Fan();
		one.setSpeed(FAST);
		one.setRadius(10);
		one.setColor("yellow");
		one.turnOn(true);
		
		Fan two = new Fan();
		two.setSpeed(MEDIUM);
		two.setRadius(5);
		two.turnOn(false);
		
		System.out.println(one.toString());
		System.out.println(two.toString());
		
		
	
		
	
		
		

	}

}
