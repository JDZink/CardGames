package blackjack;

import java.util.Scanner;

import common.Card;

public class Player {
	private Hand hand;
	private double bank;
	private String name;
	Scanner kb;

	public Player(String name) {
		super();
		this.hand = new Hand();
		this.name = name;
		this.bank = 0.0;
		this.kb = new Scanner(System.in);
	}

	public Player(double bank) {
		this("dealer");
		this.bank = bank;
	}

	public boolean playerTurn() {
		System.out.println(getName() + " your hand is: ");
		showHand();
		int ptot = handTotal();
		if (ptot> 21){
			System.out.println("Your total is " + ptot +  ". YOU BUSTED LOSER!\n");
			return false;
		}
		System.out.println("\nYour current total is " + ptot + "\nWould you like to [H]it or [S]tay");
		if (kb.next().equalsIgnoreCase("h")) {
			System.out.println("Player hits!\n");
			return true;
		} else {
			System.out.println("Player Stays.\n");
			return false;
		}
	}

	public int handTotal() {
		int i = 0;
		int aces = 0;
		for (Card card : hand) {
			if (card.getValue() > 10){
				i += 10;
			} else if(card.getValue() == 1 ){
				aces ++;
				i++;
			}else {
				i += card.getValue();
			}
		}
		for(int j = 0; j<aces; j++){
			if (i + 10 <= 21){
				i+=10;
			}
		}
		return i;
	}

	public void hit() {
	}

	public void stay() {
	}

	public void fold() {
	}

	public void bet() {

	}

	public void showHand() {
		for (Card card : hand) {
			System.out.println("\t" + card.getRank() + " of " + card.getSuit());
		}
	}

	public void showHand(int index) {
		System.out.println("\t" + this.getHand().get(index).getRank() + " of " + this.getHand().get(index).getSuit());
		System.out.println("\uf0a0\uf0a1\uf0a2\uf0a3");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Hand getHand() {
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
	public void printSplash(){
		System.out.println("" );
	}

}
