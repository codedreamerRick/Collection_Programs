package practice;

import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {
		
		HashSet emp = new HashSet();
		emp.add(new Employee("Rick", 150000));
		emp.add(new Employee("Rick1", 25000));
		emp.add(new Employee("Rick2", 150000));
		System.out.println(emp);
	}
}
