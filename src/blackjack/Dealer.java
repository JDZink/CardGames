package blackjack;

import common.*;

public class Dealer extends Player {
	
	public Dealer(){
		super(10000.00);
	}
	
	public boolean dealerLogic(){
		System.out.println("Dealer hand is: ");
		showHand();
		if (handTotal()> 21){
			System.out.println("DEALER BUSTS!");
			return false;
		}
		int ht = handTotal();
		System.out.println("current total is " + ht );
		if (ht <= 16) {
			return true;
		} else if (ht ==17){
			for (Card card : getHand()) {
				if (card.getValue() == 1){
					return true;
				}
			}
		} else {
			return false;
		}
		//unreachable code
		return false;
	}

}
