class Person
{
	String name;
	long Phone;
	String email;
	
}

class Employee extends Person
{
	String name;
	String EmployeeName;
	char GradeNumber;
	int Salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public char getGradeNumber() {
		return GradeNumber;
	}
	public void setGradeNumber(char gradeNumber) {
		GradeNumber = gradeNumber;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
}
public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
	
		employee.setName("Sandesh");
		employee.setEmployeeName("Shashank");
		employee.setSalary(400000);
		employee.setGradeNumber('A');
	
		System.out.println(employee);

	}

}
