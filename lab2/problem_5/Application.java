package cse203.lab2.problem_5;

import cse203.lab2.problem_5.book.Book;
import cse203.lab2.problem_5.library.Library;
import cse203.lab2.problem_5.user.User;

public class Application {
	public static void main(String[] args) {
		Library lib = new Library();

		User user = new User(12345, "Huyen", "ntnh@gmail.com");
		Book book = new Book("ISBN001", "Java Programming");
		User user1 = new User(54321, "Hehe", "ntnh@gmail.com");
		Book book1 = new Book("ISBN001", "Java Programming");
		

		lib.addUser(user);
		lib.addBook(book);
		lib.borrow(user, book);
		lib.addUser(user1);
		lib.addBook(book1);
		lib.borrow(user1, book1);

		System.out.println("User info: " + user);
		System.out.println("Book info: " + book);
		System.out.println(lib.getUsers());


	}

}
