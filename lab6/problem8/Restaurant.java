package lab6.problem8;

import java.util.*;

public class Restaurant {
	private String id;
	private String name;
	private String location;
	private double rating;
	private String phoneNumber;
	private List<MenuItem> menu = new ArrayList<>();

	public Restaurant() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<MenuItem> getMenu() {
		return menu;
	}

	public void setMenu(List<MenuItem> menu) {
		this.menu = menu;
	}

	public void addMenuItem(MenuItem m) {
		menu.add(m);
	}

	public void removeMenuItem(MenuItem m) {
		menu.remove(m);
	}

	public void showDetails() {
		System.out.println("===== RESTAURANT DETAILS =====");
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Location: " + location);
		System.out.println("Rating: " + rating);
		System.out.println("Phone: " + phoneNumber);
		System.out.println("\nMenu Items:");
		for (MenuItem m : menu) {
			m.showDetails();
		}
		System.out.println("==============================");
	}
}
