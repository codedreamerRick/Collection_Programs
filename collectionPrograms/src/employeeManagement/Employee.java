package employeeManagement;

import java.util.LinkedList;

public class Employee {

	private String name;
	private double salary;
	private String dept;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public String getDept()
	{
		return dept;
	}
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	
	Employee(String name, double salary, String dept)
	{
		setName(name);
		setSalary(salary);
		setDept(dept);
	}
	
}
