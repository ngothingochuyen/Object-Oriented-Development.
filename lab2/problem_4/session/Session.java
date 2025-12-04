package cse203.lab2.problem_4.session;

import java.time.LocalDate;

public class Session {
	public String type;
	private int duration;
	private LocalDate date;

	public Session(String type, int duration, LocalDate date) {
		this.type = type;
		this.duration = duration;
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return String.format("\n Type: %s\n Duration: %s\n Date %s\n", type, duration, date);
	}

}
