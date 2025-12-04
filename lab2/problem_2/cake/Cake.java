package cse203.lab2.problem_2.cake;

import java.time.LocalDate;

public class Cake {
	private String cakeType;
	private Integer numberOfTiers;
	private LocalDate eventDate;

	public Cake(String cakeType, Integer numberOfTiers, LocalDate eventDate) {
		this.cakeType = cakeType;
		this.numberOfTiers = numberOfTiers;
		this.eventDate = eventDate;
	}

	public String getCakeType() {
		return cakeType;
	}

	public void setCakeType(String cakeType) {
		this.cakeType = cakeType;
	}

	public Integer getNumberOfTiers() {
		return numberOfTiers;
	}

	public void setNumberOfTiers(Integer numberOfTiers) {
		this.numberOfTiers = numberOfTiers;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	@Override
	public String toString() {
		return String.format("\n Cake Type: %s\n Number of Tiers: %d\n Event Date: %s\n", cakeType, numberOfTiers,
				eventDate);
	}

}
