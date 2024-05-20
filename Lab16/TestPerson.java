//Evelyn Sun
//115417946

public class TestPerson {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person("Person", "Person Street", "800-888-8888", 21, "person@email.com");
		Student student = new Student("Student", "Student Street", "800-888-8888", 18, "student@email.com", Student.FRESHMAN);
		Employee employee = new Employee("Employee", "Employee Street", "800-888-8888", 30, "employee@gmail.com",40000, new MyDate(1,1,2015));
		Faculty faculty = new Faculty("Faculty", "Faculty Street", "800-888-8888", 45, "faculty@email.com", 60000, new MyDate(1,1,1990), "M/W 8:30AM-10:10AM,",5);
		Staff staff = new Staff("Staff","Staff Street", "800-888-8888",40,"staff@gmail.com",45000,new MyDate(1,1,2000),"Admin");
		
		System.out.println(person);
		System.out.println(student);
		System.out.println(employee);
		System.out.println(faculty);
		System.out.println(staff);

	}

}
