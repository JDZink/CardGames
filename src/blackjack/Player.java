package blackjack;

public class Player {
	private Hand hand;
	private double bank;
	private String name;

	public Player(String name) {
		super();
		this.name = name;
		this.bank = 0.0;
	}
	public Player(double bank) {
		super();
		this.bank = bank;
	}

	public static void hit() {
	}

	public static void stay() {
	}

	public static void fold() {
	}

	public static void bet() {

	}

	public static void showHand() {

	}

	Hand getHand() {
		return hand;
	}

	void setHand(Hand hand) {
		this.hand = hand;
	}

	double getBank() {
		return bank;
	}

	void setBank(double bank) {
		this.bank = bank;
	}

}
