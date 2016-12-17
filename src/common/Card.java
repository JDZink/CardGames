package common;

public class Card implements Comparable<Card> {
	private Rank rank;
	private Suit suit;
	private int value;

	public Card(Rank rank, Suit suit, int value) {
		super();
		this.rank = rank;
		this.suit = suit;
		this.value = value+1;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public int compareTo(Card card) {
        int rcompare = this.rank.compareTo(card.rank);
        int scompare = this.suit.compareTo(card.suit);

        if (rcompare == 0)
            return scompare;
        else
            return rcompare;
    }
	
}
