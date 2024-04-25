package phoneBook;

public class Contact implements Comparable<Contact> {

	String name;
	long phoneNumber;
	
	public Contact(String name, long phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
//
//	@Override
	public String toString() {
		return "\nName : "+name+", Phone Number : "+phoneNumber;
	}
//	
//	@Override
//	public int hashCode() {
//		return name.hashCode();
//	}
//	
//	@Override
	public int compareTo(Contact o) {
		return this.name.compareTo(o.name);
	}
	
}
