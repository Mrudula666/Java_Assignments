/**
 * 
 */
package corejava.day3assignments;


import java.time.LocalDate;
/**
 * @author mrnimmal
 *
 */

public class Person {
	//Date currenDate = new Date();
	private String name;
	private Date dob;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name,int d,int m,int y){
		dob = new Date();
		this.name = name;
		this.dob.setD(d);
		this.dob.setM(m);
		this.dob.setY(y);
	}
	public String getName() {
		return name;
	}
	
	public void display() {
		LocalDate now = LocalDate.now();
		int ageYears = (now.getYear()-dob.getY());
		int ageMonth = now.getMonthValue()-dob.getM();
		int ageDays = (now.getDayOfMonth()-dob.getD());
		System.out.println("Name: "+name);
		System.out.println("Date Of Birth:"+dob.getD()+"/"+dob.getM()+"/"+dob.getY());
		System.out.println("Age: "+ageYears+"Years,"+ageMonth+"Months,"+ageDays+"Days");
		
	}
	public void olderOne(Person person1) {
		int differenceInYear = 0;
		int differenceInMonths = 0;
		int differenceInDay = 0;
		String olderName = "";
		String youngerName = "";
		if(person1.dob.getD()<dob.getD() || person1.dob.getM()<dob.getM() || person1.dob.getY()<dob.getY()){
			olderName = getName();
			youngerName = person1.getName();
		differenceInDay = (dob.getD()-person1.dob.getD());
		differenceInMonths = (dob.getM()- person1.dob.getM());
		differenceInYear = (dob.getY() - person1.dob.getY());
		}
		else {
			olderName = getName();
			youngerName = person1.getName();
		differenceInDay = (person1.dob.getD()-dob.getD());
		differenceInMonths = (person1.dob.getM()-dob.getM());
		differenceInYear = (person1.dob.getY()-dob.getY());
		}
		
		System.out.println(olderName+" is older than "+youngerName+" by "+differenceInYear+" Years, "+differenceInMonths+" Months, "+differenceInDay+" Days");
		
		
		
	}
	
}
