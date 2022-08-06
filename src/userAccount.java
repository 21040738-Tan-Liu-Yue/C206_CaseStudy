
public class userAccount {
	
	private String username;
	private String password;
	private boolean available;
	
	public userAccount(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public boolean login(String inputUsername, String inputPassword) {
		if (inputUsername == username && inputPassword == password) {
			return true;
		} else {
			return false;
		}
		
	}
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}	
	
	public boolean getisAvailable() {
		return available;
	}


	public void setAvailable(boolean available) {
		this.available = available;
	}
}
