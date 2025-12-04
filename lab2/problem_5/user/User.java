package cse203.lab2.problem_5.user;

public class User {
	private Integer userId;
	private String name;
	private String email;

	public User(Integer userId, String name, String email) {
		this.userId = userId;
		this.name = name;
		this.email = email;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean equals(User user) {
		return this.userId.equals(user.userId);
	}

	@Override
	public String toString() {
		return String.format("\n User ID: %s, User name: %s, Email: %s\n", userId, name, email);
	}

}
