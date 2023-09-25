package bootcamp.java.blackjack.library.models;

public class Player {
	
	private int id;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private double wallet;
	private double winnings;
	
	/* Getters & Setters */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getWallet() {
		return wallet;
	}
	public void setWallet(double wallet) {
		this.wallet = wallet;
	}
	public double getWinnings() {
		return winnings;
	}
	public void setWinnings(double winnings) {
		this.winnings = winnings;
	}
}
