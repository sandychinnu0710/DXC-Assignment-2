package SwiftFoodDXC;

public class Author {
	private String name;
	private String emailId;
	private char gender;
	
	public Author(String name, String emailId, char gender) 
	{
		this.name = name;
		this.emailId = emailId;
		this.gender = gender;
	}

        public String getName() {
		return name;
	}

        public void setName(String name) {
		this.name = name;
	}

        public String getEmailId() {
		return emailId;
	}

        public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

        public char getGender() {
		return gender;
	}

        public void setGender(char gender) {
		this.gender = gender;
	}

}

 class Book
{
    private String name;
    private Author author;
    private double price;
    private int quantity;
    
    public Book(String name, Author author, double price, int quantity)
    {
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}

    public void displayAuthorDetails()
    {
    	System.out.println();
		System.out.println("Showing Author details");
		System.out.println("Author name :"+author.getName());
		System.out.println("Author email :"+author.getEmailId());
		System.out.println("Author gender :"+author.getGender());
    	
    }

    public String getName() {
		return name;
	}

    public void setName(String name) {
		this.name = name;
	}

    public Author getAuthor() {
		return author;
	}

    public void setAuthor(Author author) {
		this.author = author;
	}

    public double getPrice() {
		return price;
	}

    public void setPrice(double price) {
		this.price = price;
	}

    public int getQuantity() {
		return quantity;
	}

    public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

   class Tester
   {
  public static void main(String[] args)
  {
	  Author a1=new Author("Jousha Bloch","Joshua@gmail.com",'M');
		Book b1=new Book("Book 1",a1,100,2);
		b1.displayAuthorDetails();

	}

}
}
