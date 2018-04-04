import java.util.Calendar;
import java.util.Date;

public class Assignment {

	public static String whichSemester(int month) {
	    switch(month) {
        case Calendar.SEPTEMBER:
        case Calendar.OCTOBER:
        case Calendar.NOVEMBER:
        case Calendar.DECEMBER:
        case Calendar.JANUARY:
              return "FALL";
        case Calendar.FEBRUARY:
        case Calendar.MARCH:
        case Calendar.APRIL:
        case Calendar.MAY:
        case Calendar.JUNE:
              return "SPRING";
        default:
              return "SUMMER";
	    }
	}
	
	public static void getMonth()
	{
		Date date= new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println("Current Semester is " + whichSemester(cal.get(Calendar.MONTH)));
		System.out.println("**************************************");
	}
	
	public static void getAdvisorStudents(Advisor reyiz)
	{
		System.out.println(reyiz.getFirstName() + " " + reyiz.getLastName() + " NumberOfStudents : " + reyiz.getNumberOfStudentsAssigned());
		System.out.println("**************************************");
	}
	
	public static void main(String[] args) {
		/* Students Create  */
		Student firststu = new Student("Berat","Kara",24,2,3);
		Student secondstu = new Student("Ýnanç","Çakýl");
		Student thirtstu = new Student("Sadi","Yýldýz",19,1,2);
		Student fourthstu = new Student("Oðuzhan","Uður",23);
		/* Advisor Create  */
		Advisor firstadv = new Advisor("Vitalic","Buterin");
		Advisor secondadv = new Advisor("Satoshi","Nakamoto");
		Advisor thirtadv = new Advisor("Jihan","Lee");
		
		/* Advisor Assign Student  */
		firstadv.assignStudentToAdvisor();
		firstadv.assignStudentToAdvisor();
		firstadv.assignStudentToAdvisor();
		firstadv.assignStudentToAdvisor();
		
		/* Advisor Get Students Count  */
		getAdvisorStudents(firstadv);
		
		/* Advisor Assign Student  */
		secondadv.assignStudentToAdvisor();
		
		/* Advisor Get Students Count  */
		getAdvisorStudents(secondadv);
		
		/* Advisor Get Students Count  */
		getAdvisorStudents(thirtadv);
		
		/* Student Details  */
		secondstu.toStrStudentDetails();
		
		/* Student GPA Status  */
		thirtstu.currentStatus();
		
		/* Student Setter/Getter Test Method  */
		fourthstu.setYear(5);
		fourthstu.setGPA(-1.0);
		
		/* Student GPA Status  */
		fourthstu.currentStatus();
		
		/* Get Month and Select Season  */
		getMonth();
		
		/* Advisor Details  */
		firstadv.toStrAdvisorDetails();
		secondadv.toStrAdvisorDetails();
		thirtadv.toStrAdvisorDetails();
	}
	
	
}
