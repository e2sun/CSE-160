//Evelyn Sun
//115417946

public class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private int age;
	private String emailAddress;
	
	public Person (String n, String ad, String p, int a, String eA) {
		name=n;
		address=ad;
		phoneNumber=p;
		age=a;
		emailAddress=eA;
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "Person with name: " + getName();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
