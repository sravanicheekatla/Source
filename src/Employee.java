
public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private int employeeAge;
	private String designation;
	private char gender;
	public Employee(int employeeId,String employeeName,double salary,int employeeAge,String designation,char gender ) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
		this.employeeAge=employeeAge;
		this.designation=designation;
		this.gender=gender;
		
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public String getDesignation() {
		return designation;
	}
	public char getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Employee[employyeId="+employeeId+",employeeName="+employeeName+",salary="+salary+",employeeAge="+employeeAge+",designation="+designation+",gender="+gender+"]";
		
		
	}
}
