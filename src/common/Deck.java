package common;

import java.util.*;

public class Deck{
	private List<Card> cardsInDeck;
	private int cardsRemaining;

	public List<Card> getCardsInDeck() {
		return cardsInDeck;
	}

	public void setCardsInDeck(List<Card> cardsInDeck) {
		this.cardsInDeck = cardsInDeck;
	}

	public Deck(String type) {
		int numCards = 0;
		this.cardsInDeck = new ArrayList<>();
		switch (type) {
//		case "pinnochle":
//			break;
		case "poker":
		default:
			for (Suit s : Suit.values()) {
				int i = 0;
				for (Rank r : Rank.values()) {
					cardsInDeck.add(new Card(r, s, i));
					i++;
				}
				numCards += i ;
			}
			break;

		}
		this.setCardsRemaining(numCards);
	}

	public int getCardsRemaining() {
		return cardsRemaining;
	}

	public void setCardsRemaining(int cardsRemaining) {
		this.cardsRemaining = cardsRemaining;
	}

}
