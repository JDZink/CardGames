package common;

import java.util.*;

public class Deck extends ArrayList<Card>{


	public Deck(String type) {
		super();
		switch (type) {
//		case "pinnochle":
//			break;
		case "poker":
		default:
			for (Suit s : Suit.values()) {
				int i = 0;
				for (Rank r : Rank.values()) {
					this.add(new Card(r, s, i));
					i++;
				}
			}
			break;

		}
		
	}

}
