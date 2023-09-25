package bootcamp.java.blackjack.library.models;

public class Hand {
	
	private int id;
	private double initialBet;
	private int playerHandTotal;
	private int dealerHandTotal;
	private String winOrLoss;
	private double amountWon;
	private Player player;
	
	/* Getters & Setters */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getInitialBet() {
		return initialBet;
	}
	public void setInitialBet(double initialBet) {
		this.initialBet = initialBet;
	}
	public int getPlayerHandTotal() {
		return playerHandTotal;
	}
	public void setPlayerHandTotal(int playerHandTotal) {
		this.playerHandTotal = playerHandTotal;
	}
	public int getDealerHandTotal() {
		return dealerHandTotal;
	}
	public void setDealerHandTotal(int dealerHandTotal) {
		this.dealerHandTotal = dealerHandTotal;
	}
	public String getWinOrLoss() {
		return winOrLoss;
	}
	public void setWinOrLoss(String winOrLoss) {
		this.winOrLoss = winOrLoss;
	}
	public double getAmountWon() {
		return amountWon;
	}
	public void setAmountWon(double amountWon) {
		this.amountWon = amountWon;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
}
