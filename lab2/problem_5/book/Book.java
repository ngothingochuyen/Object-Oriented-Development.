package cse203.lab2.problem_5.book;

public class Book {

	private String isbn;
	private String title;

	public Book(String isbn, String title) {
		this.title = title;
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean equals(Book book) {
		return this.isbn.equals(book.isbn);
	}

	@Override
	public String toString() {
		return String.format("\n ISBN: %s, Title: %s\n", isbn, title);
	}

}
