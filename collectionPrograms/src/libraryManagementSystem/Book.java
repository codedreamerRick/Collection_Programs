package libraryManagementSystem;

public class Book {

	private String title;
	private String author;
	private String id;
	private boolean isAvailable;
	
	public String getTitle()
	{
		return this.title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getAuthor()
	{
		return this.author;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public String getId()
	{
		return this.id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public boolean getAvailable()
	{
		return this.isAvailable;
	}
	
	public void setAvailable(boolean isAvailable)
	{
		this.isAvailable = isAvailable;
	}
	
	public Book(String title, String author, String id, boolean isAvailable)
	{
		setTitle(title);
		setAuthor(author);
		setId(id);
		setAvailable(isAvailable);
	}
	
	@Override
	public String toString() {
		return "Title : "+title+"\nAuthor : "+author+"\nID : "+id+"\nStatus : "+(isAvailable ? "Available" : "Not Available");
	}
}
