/*Amritpal Singh
 * Lab 5 - HashTables
 * CUS 1126
 */

import java.util.*;

public class HashTableImplementation {
	
	int bookID;
	String location;
	String title;
	String author;
	String bookStatus;

	//creates hashtable
	static Hashtable<Integer, Book>library =  new Hashtable<Integer, Book>();
	
	//inserts into library and checks for duplicates
	public static void insertLibrary(int key, Book book) {
		Scanner kb = new Scanner(System.in);
		if (library.containsKey(key)) {
			System.out.println("Error!, Book with the same key exists, please enter another key");
			System.exit(0);
		}
		else {
			library.put(key, book);
		}
	}
	
	
	public static void main(String[] args) {
		
	
		Book book1 = new Book(1111, "Row 8 Bookshelf C", "Lord of the Rings", "J.R.R. Tolkien", "Available");
		Book book2 = new Book(2222, "Row 3 Bookshelf A", "To Kill a Mockingbird", "Harper Lee", "Currently Out - Returns in 4 days Issued to Member # 3497");
		Book book3 = new Book(3333, "Row 2 Bookshelf K", "The Great Gatsby", "F. Scott Fitzgerald", "Currently Out - Returns in 9 days Issued to Member # 6468");
		Book book4 = new Book(4444, "Row 24 Bookshelf D", "A Tale of Two Cities", "Charles Dickens", "Available");
		Book book5 = new Book(5555, "Row 12 Bookshelf Z", "Odyssey", "Homer", "Available");
		
		//calls insertLibrary method to enter all books into the library
		insertLibrary(((book1.bookID/2)%10), book1);
		insertLibrary(((book2.bookID/2)%10), book2);
		insertLibrary(((book3.bookID/2)%10), book3);
		insertLibrary(((book4.bookID/2)%10), book4);
		insertLibrary(((book5.bookID/2)%10), book5);
		
		int choice =1;
		do {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the book ID of the book you are looking for");//prompts user for their book id
		int bookSearch = (kb.nextInt()/2)%10;//--changes book Id into key to search
		
		
		if (library.get(bookSearch)==null) {//if info at key is null
			System.out.println("This book does not exist within the library");
			System.out.println("Press 1 to search again");
			choice = kb.nextInt();
					
		}
		else {
			System.out.println("Book with key " + bookSearch + " found!");
			System.out.println("ID:" + library.get(bookSearch).bookID +"\nLocation: " + library.get(bookSearch).location + 
					"\nTitle: " + library.get(bookSearch).title + "\nAuthor: " + library.get(bookSearch).author +
					"\nBook Status: " + library.get(bookSearch).bookStatus);
			
			System.out.println("Press 1 to search again");//loops if user wants to search for another book
			choice = kb.nextInt();

		}
		}
		while (choice==1); 
}
}

/*Sample Output:
Please enter the book ID of the book you are looking for
2222
Book with key 1 found!
ID:2222
Location: Row 3 Bookshelf A
Title: To Kill a Mockingbird
Author: Harper Lee
Book Status: Currently Out - Returns in 4 days Issued to Member # 3497
Press 1 to search again
1
Please enter the book ID of the book you are looking for
5555
Book with key 7 found!
ID:5555
Location: Row 12 Bookshelf Z
Title: Odyssey
Author: Homer
Book Status: Available
Press 1 to search again
2
*/
 
