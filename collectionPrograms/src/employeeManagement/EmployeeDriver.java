package employeeManagement;

import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		LinkedList<Employee> lin_list = new LinkedList<>();
		lin_list.add(new Employee("Ram", 10000, "dev"));
		lin_list.add(new Employee("John", 30000, "test"));
		lin_list.add(new Employee("Miller", 15000, "dev"));
		lin_list.add(new Employee("Smith", 20000, "test"));
		System.out.println("Enter the department to find the average salary...!");
		String dept = scan.next();
		int sum = 0;
		int count = 0;
		for(Object o : lin_list)
		{
			if(((Employee)o).getDept().endsWith(dept))
			{
				sum += ((Employee)o).getSalary();
				count++;
			}
		}
		double avg = sum / count;
		System.out.println("The average salary of department "+dept+" is "+avg);
	}
}
