package practice;

public class Employee {

	String name;
	int salary;
	
	public Employee(String name, int salary) 
	{
		super();
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		return "\nName : "+name+" , Salary : "+salary;
	}
	
	@Override
	public int hashCode() 
	{
		return salary;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		Employee e = (Employee)obj;
		return salary == e.salary;
	}
}
