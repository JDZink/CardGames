package blackjack;

import java.util.*;

import common.*;

public class Hand extends ArrayList<Card>{
	private int maxHandSize;

	public int getMaxHandSize() {
		return maxHandSize;
	}

	public void setMaxHandSize(int maxHandSize) {
		this.maxHandSize = maxHandSize;
	}
	
	
}
