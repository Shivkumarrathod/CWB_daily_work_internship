 public class Employee {
	
	//Instance Variable
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private String mobile;
	private int age;
	private String dob;
	
	public Employee() {
		super();
	}
 
	public Employee(int id, String firstName, String lastName, String address, String mobile, int age, String dob) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
		this.age = age;
		this.dob = dob;
	}
 
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", mobile=" + mobile + ", age=" + age + ", dob=" + dob + "]";
	}
	
	public void display()
	{
		System.out.println("Id="+id);
		System.out.println("firstName="+firstName);
		System.out.println("lastName="+lastName);
	}
	
 
}
 
 