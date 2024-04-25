package hashSet;

public class Student {

	String sid;
	String name;
	String Class;
	
	public Student(String sid, String name)
	{
		this. sid = sid;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "\n"+sid+", "+name;
	}
	
	@Override
	public int hashCode() {
		return sid.hashCode() + name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return (sid.equals(((Student)obj).sid) && name.equals(((Student)obj).name));
	}
}

