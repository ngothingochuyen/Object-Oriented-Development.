package cse203.lab2.problem_5.borrowingRecord;

import java.time.LocalDate;

import cse203.lab2.problem_5.book.Book;
import cse203.lab2.problem_5.user.User;

public class BorrowingRecord {
	private User user;
	private Book book;
	private LocalDate borrowedDate;
	private LocalDate dueDate;

	public BorrowingRecord(User user, Book book, LocalDate borrowedDate, LocalDate dueDate) {
		this.user = user;
		this.book = book;
		this.borrowedDate = borrowedDate;
		this.dueDate = dueDate;
	}

	public User getUser() {
		return user;
	}

	public Book getBook() {
		return book;
	}

	public LocalDate getBorrowedDate() {
		return borrowedDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate d) {
		this.dueDate = d;
	}

	@Override
	public String toString() {
		return String.format("Record: \n User: %s, Book: %s, Borrowed: %s, Due: %s\n", user.getName(), book.getTitle(),
				borrowedDate, dueDate);
	}
}
