import java.io.Console;

public class Student extends Assignment {
	private String firstName;
	private String lastName;
	private int age = 18;
	private int year = 1;
	private double GPA = 0;
	
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Student(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public Student(String firstName, String lastName, int age, int year, double gPA) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.year = year;
		GPA = gPA;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		if(year > 4 || year < 1) 
		{
			System.out.println("ERROR: Wrong year value for student: " + year); 
			System.out.println("**************************************");
			return;
		}
		this.year = year;
	}
	
	public double getGPA() {
		return GPA;
	}
	
	public void setGPA(double gPA) {
		if(gPA > 4 || gPA < 0) 
		{
			System.out.println("ERROR: Wrong GPA value for student: " + gPA); 
			System.out.println("**************************************");
			return;
		}
		GPA = gPA;
	}
	
	public void toStrStudentDetails()
	{
		System.out.println("STUDENT NAME: " + getFirstName() + " " + getLastName()); 
		System.out.println("AGE: " + getAge()); 
		System.out.println("YEAR: " + getYear()); 
		System.out.println("GPA: " + getGPA()); 
		System.out.println("**************************************");
	}
	
	public boolean isSuccessful()
	{
		if(getGPA() > 2.5)
			return true;
		return false;
	}
	
	public void currentStatus()
	{
		System.out.print("STUDENT: " + getFirstName() + " " + getLastName());
		if(isSuccessful())
			System.out.println(" SUCCESSFUL");
		else
			System.out.println(" NOT SUCCESSFUL");
		
		System.out.println("**************************************");
	}
	
}
