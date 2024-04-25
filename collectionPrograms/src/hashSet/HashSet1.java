package hashSet;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<Student> students = new HashSet();
		students.add(new Student("123","Rick"));
		students.add(new Student("123","Rik"));
		students.add(new Student("123","ck"));
		students.add(new Student("123","ick"));
		students.add(new Student("123","Rick"));
		System.out.println(students);
	}
}
