package cse203.lab2.problem_5.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import cse203.lab2.problem_5.book.Book;
import cse203.lab2.problem_5.borrowingRecord.BorrowingRecord;
import cse203.lab2.problem_5.user.User;

public class Library {
	private List<User> users;
	private List<Book> books;
	private List<BorrowingRecord> borrowingRecords;

	public Library() {
		users = new ArrayList<>();
		books = new ArrayList<>();
		borrowingRecords = new ArrayList<>();
	}

	public List<User> getUsers() {
		return users;
	}

	public List<Book> getBooks() {
		return books;
	}

	public List<BorrowingRecord> getBorrowingRecords() {
		return borrowingRecords;
	}

	public void addUser(User user) {
		users.add(user);
	}

	public void removeUser(User user) {
		users.remove(user);
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void removeBook(Book book) {
		books.remove(book);
	}

	public void addBorrowingRecord(BorrowingRecord borrow) {
		borrowingRecords.add(borrow);
	}

	public void borrow(User user, Book book) {
		if (!checkEligibility(user)) {
			System.out.println(user.getName() + " is not eligible to borrow a book.");
			return;
		}

		LocalDate today = LocalDate.now();
		LocalDate due = today.plusDays(10);
		BorrowingRecord record = new BorrowingRecord(user, book, today, due);
		borrowingRecords.add(record);
		System.out.println(user.getName() + " borrowed \"" + book.getTitle() + "\" on " + today + ". Due: " + due);
	}

	public boolean checkOverdue(User user) {
		LocalDate today = LocalDate.now();
		for (BorrowingRecord borrow : borrowingRecords) {
			if (borrow.getUser().equals(user) && borrow.getDueDate().isBefore(today)) {
				return true;
			}
		}
		return false;
	}

	public boolean checkEligibility(User user) {
		return !checkOverdue(user);
	}

	@Override
	public String toString() {
		return "Library Info:\nUsers: " + users + "\nBooks: " + books + "\nRecords: " + borrowingRecords;
	}

}
