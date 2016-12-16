package common;

import java.util.*;

public class Deck {
	private List<Card> cardsInDeck;

	List<Card> getCardsInDeck() {
		return cardsInDeck;
	}

	void setCardsInDeck(List<Card> cardsInDeck) {
		this.cardsInDeck = cardsInDeck;
	}

	public Deck(String type) {
		this.cardsInDeck = new ArrayList<>();
		switch (type) {
		case "pinnochle":
			break;
		case "poker":
		default:
			for (Suit s : Suit.values()) {
				int i = 0;
				for (Rank r : Rank.values()) {
					cardsInDeck.add(new Card(r, s, i));
					i++;
				}
			}
			break;

		}
	}

}
