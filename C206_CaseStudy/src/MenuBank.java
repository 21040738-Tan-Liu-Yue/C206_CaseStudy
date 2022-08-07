
public class MenuBank {

	  private String description;
	  private boolean available;
	  private double cost;
	  
	  
	  public MenuBank(String description, double cost) {
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
	    this.cost = cost ;
	  }

}


