package blackjack;

import java.util.*;
import common.*;

public class Table {
	private Dealer dealer;
	private List<Player> players;
	private Deck shoe;
	private Scanner kb;
	// private double pot;

	public static void main(String... args) {
		Table tbl = new Table();
		tbl.playGame();
	}

	public Table() {
		super();
		this.dealer = new Dealer();
		kb = new Scanner(System.in);
		this.players = new ArrayList<>();
		this.players.add(new Player("generic"));
		this.shoe = new Deck("");
		// <<<<<MILTIPLE PLAYERS>>>>>
		// System.out.println("How many players do you have?");
		// int p = kb.nextInt();
		// for (int i = 0; i<p; i++){
		// System.out.printf("Please name Player %d:", i+1);
		// players.add(new Player(kb.next()));
		// }
	}

	public Table(Dealer dealer, List<Player> players, Deck shoe) {
		super();
		this.dealer = dealer;
		this.players = players;
		this.shoe = shoe;
	}

	public void playGame() {
		shuffleDeck();
		while (true) {
			dealInitialHand();
			showStartingHands();
			takeTurns();
			findWinners();
			System.out.println("Would you like to play again? [Y] or [N]");
			if (!kb.next().equalsIgnoreCase("y")) {
				break;
			}
			if(shoe.size() < 52/4){
				System.out.println("Shuffling Deck.");
				shoe = new Deck("poker");
				shuffleDeck();
			}
			clearHands();
		}

	}

	public void clearHands() {
		dealer.getHand().clear();
		for (Player player : players) {
			player.getHand().clear();
		}
		
	}

	public void findWinners() {
		int dealerTot = dealer.handTotal();
		for (Player player : players) {
			int playerTot = player.handTotal();
			if (playerTot < 22) {
				if (playerTot > dealerTot || dealerTot > 21) {
					System.out.println(player.getName() + " You beat the dealers " + dealerTot + " with " + playerTot
							+ ". CONGRATULATIONS!");
				} else if (playerTot == dealerTot) {
					System.out.println(
							player.getName() + " You push the dealers " + dealerTot + " with " + playerTot + ". ");
				} else if (playerTot < dealerTot) {
					System.out.println(player.getName() + " You lost to the dealers " + dealerTot + " with " + playerTot
							+ ". Better Luck next time......Loser. ");
				}
			}
		}

	}

	public void takeTurns() {
		for (Player player : players) {
			boolean playing = true;
			while (playing) {
				playing = player.playerTurn();
				if (playing)
					player.getHand().add(getACard());
			}
		}
		boolean playing = true;
		while (playing) {
			playing = dealer.dealerLogic();
			if (playing)
				dealer.getHand().add(getACard());

		}
	}

	Dealer getDealer() {
		return dealer;
	}

	public void shuffleDeck() {

		Collections.shuffle(shoe);
	}

	public void dealInitialHand() {
		for (int i = 0; i < 2; i++) {
			for (Player p : players) {
				p.getHand().add(getACard());
			}
			dealer.getHand().add(getACard());
		}
	}

	public Card getACard() {
		Card cardToDeal = shoe.remove(0);
		return cardToDeal;
	}

	public void showStartingHands() {
		System.out.print("Dealer up card is: ");
		dealer.showHand(1);
		for (Player player : players) {
			System.out.print("\nPlayer " + player.getName() + " up card is:");
			player.showHand(1);
			System.out.println();
		}
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
