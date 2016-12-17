package blackjack;

import java.util.*;

import common.*;

public class Table {
	private Dealer dealer;
	private List<Player> players;
	private Deck shoe;
	private Scanner kb;
	// private double pot;

	public Table() {
		super();
		this.dealer = new Dealer();
//		System.out.println("How many players do you have?");
		kb = new Scanner(System.in);
//		int p = kb.nextInt();
		this.players = new ArrayList<>();
		this.players.add(new Player("generic"));
//		for (int i = 0; i<p; i++){
//			System.out.printf("Please name Player %d:", i+1);
//			players.add(new Player(kb.next()));
//		}
		this.shoe = new Deck("");
	}
	public Table(Dealer dealer, List<Player> players, Deck shoe) {
		super();
		this.dealer = dealer;
		this.players = players;
		this.shoe = shoe;
	}

	Dealer getDealer() {
		return dealer;
	}
	public void shuffleDeck(){
		
		Collections.shuffle(shoe);
	}
	public void dealInitialHand(){
		for (int i = 0; i<2;i++){
			for (Player p : players){
				p.getHand().add(getACard());
			}
			dealer.getHand().add(getACard());
		}
	}
		
	public Card getACard(){
		Card cardToDeal = shoe.remove(0);
		return cardToDeal;
	}

	void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	List<Player> getPlayers() {
		return players;
	}

	void setPlayers(List<Player> players) {
		this.players = players;
	}

	Deck getShoe() {
		return shoe;
	}

	void setShoe(Deck shoe) {
		this.shoe = shoe;
	}
	
	// double getPot() {
	// return pot;
	// }
	// void setPot(double pot) {
	// this.pot = pot;
	// }

}
