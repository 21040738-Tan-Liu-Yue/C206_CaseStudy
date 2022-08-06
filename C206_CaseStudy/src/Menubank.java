/**
 * 
 */

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 21013269, 5 Aug 2022 1:57:39 pm
 */

public class Menubank {	
	private String description;
	private boolean available;
	private double cost;
	
	
	public Menubank(String description, double cost) {
		this.description = description;
		this.available = true;
		this.cost = cost;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean getisAvailable() {
		return available;
	}


	public void setAvailable(boolean available) {
		this.available = available;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}



	
	
	
}


