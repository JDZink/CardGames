package blackjack;

import java.util.*;

import common.*;

public class Table {
	private Dealer dealer;
	private List<Player> players;
	private Deck shoe;
	// private double pot;

	public Table(Dealer dealer, List<Player> players, Deck shoe) {
		super();
		this.dealer = dealer;
		this.players = players;
		this.shoe = shoe;
	}

	Dealer getDealer() {
		return dealer;
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
