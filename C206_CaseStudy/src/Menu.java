public class Menu {

	private String month;
	private String description;
	private boolean available;
	private double cost;

	public Menu(String month, String description, double cost) {
		this.month = month;
		this.description = description;
		this.available = true;
		this.cost = cost;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
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
