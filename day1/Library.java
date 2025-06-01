package week2.day1;

public class Library {
	
	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public void issueBook() {
		// TODO Auto-generated method stub
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		Library options=new Library();
		options.addBook("java");
		options.issueBook();
	}
	
	

}
