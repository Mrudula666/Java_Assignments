/**
 * 
 */
package corejava.day2assignments;

/**
 * @author mrnimmal
 * Attributes:
	Id
	name
	monthlyBasic
	Behaviours/Interfaces/Services: 
		getAnnualBasic() //(return 12 * monthlyBasic;)
		getMonthlyGrossSalary()//(monthlyBasic + hra + medical + conveyance)
		getAnnualGrossSalary() //(12 * MonthlyGrossSalary)
		getMonthlyDeductions() //(pf + esic + profTax)
		getMonthlyTakeHome() //(MonthlyGrossSalary- MonthlyDeductions)
		getAnnualTakeHome() //(12 * MonthlyTakeHome)
		setPFRate(float f)  and getPFRate()


	HRA = 50% of basic, medical allowance = Rs 1250, conveyance allowance = Rs 800
	PF = 10% of  monthly basic or 6500 whichever is lower.
	ESIC = 4.75% of monthly basic if monthly basic <= 5000
	professional tax: if monthly gross <= 10000 then Rs 50, else Rs 100

 *
 */
public class Employee_Assignment {
	private static int idGenerator = 100;//common for all employees
	private int id;
	private String name;
	private double monthlyBasic;
	private static int pfRate;//pfRate should be common for all employees so it should be static.
	public Employee_Assignment() {
		super();
	}
	//Argumented constructor that initializes the attributes of the class. 
	public Employee_Assignment(int id,String name, double monthlyBasic) {
		super();
		this.id = id;
		this.name = name;
		this.monthlyBasic = monthlyBasic;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//Setters and getters for private attributes in employee class.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlyBasic() {
		return monthlyBasic;
	}
	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
	public static int getPfRate() {
		return pfRate;
	}
	public static void setPfRate(int pfRate) {
		Employee_Assignment.pfRate = pfRate;
	}
	//Behavior of the employee_Assignment class
	public double getAnnualBasic(){
		return (12*monthlyBasic);
		
	}
	public double getMonthlyGrossSalary(){
		final int medicalAllowance = 1250;
		final int conveyanceAllowance =  800;
		double monthlyGrossSalary = monthlyBasic+(getHra())+medicalAllowance+conveyanceAllowance;
		return monthlyGrossSalary;
	}
	//calculating the hra of the employee
	private double getHra() {
		double hra = (double)(monthlyBasic)*(50/100);
		return hra;
	}
	public double getAnnualGrossSalary(){
		double annualGrossSalary = 12*getMonthlyGrossSalary();
		//System.out.println(annualGrossSalary);
		return (annualGrossSalary);
	}
	public double getMonthlyDeductions(){
		double pf = getPf();
		double esic = getEsic();
		double professional_tax = getprofTax();
		double monthlyDeductions = (pf+esic+professional_tax);
		//System.out.println(monthlyDeductions);
	return monthlyDeductions;
		
	}
	 private double getprofTax() {
		 double professional_tax=0;
		 if(monthlyBasic<=10000)
			 professional_tax = 50;
		 else
			 professional_tax = 100;
		return professional_tax;
	}
	private double getEsic() {
		 double esic = 0;
		 if(monthlyBasic<=5000)
			 esic = (monthlyBasic)*(4.75/100);
		return esic;
	}
	private  double getPf() {
		int pfRate = Employee_Assignment.getPfRate();
		 double pf = (double)(monthlyBasic)*(pfRate/100);
		 if(pf <= 6500)
			 pf = 6500;
		return  pf;
	}
	public double getMonthlyTakeHome(){
		return (getMonthlyGrossSalary()-getMonthlyDeductions());
	}
	public double getAnnualTakeHome(){
		return (12*getMonthlyTakeHome());
	}
	@Override
	public String toString() {
		return "Employee_Assignment [id=" + id + ", name=" + name
				+ ", monthlyBasic=" + monthlyBasic + "]";
	}

}
