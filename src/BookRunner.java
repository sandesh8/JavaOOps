
public class BookRunner {
	int Id;
	String name;
	String author;
	
	public BookRunner(int Id, String name, String author)
	{
		this.Id = Id;
		this.name = name;
		this.author = author;
	}
	
	public String toString()
	{
		return String.format("name = %s author = %s, Id = %d", Id, name, author);
		
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BookRunner book = new BookRunner(31, "Sandesh Kumar", "Martin");
     book.toString();
     
     
     
    		 
	}

}
