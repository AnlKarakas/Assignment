import java.util.Random;

public class Advisor extends Assignment {
	private String firstName;
	private String lastName;
	private int ID;
	private int numberOfStudentsAssigned;

	public Advisor(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Random identity = new Random();
		setID(identity.nextInt() & Integer.MAX_VALUE);
		numberOfStudentsAssigned = 0;
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
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public int getNumberOfStudentsAssigned() {
		return numberOfStudentsAssigned;
	}
	
	public void assignStudentToAdvisor()
	{
		if(numberOfStudentsAssigned >= 3)
		{
			System.out.println("ERROR: Cannot assign more students to advisor ADVISOR ID: " + getID() + " NAME: " + getFirstName() + " " + getLastName());
			System.out.println("**************************************");
			return;
		}
		numberOfStudentsAssigned++;
	}
	
	public void toStrAdvisorDetails()
	{
		System.out.println("ADVISOR ID: " + getID() + " NAME: " + getFirstName() + " " + getLastName()); 
		System.out.println("**************************************");
	}
	
}
