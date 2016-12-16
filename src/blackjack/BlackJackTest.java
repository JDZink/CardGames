package blackjack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import common.Deck;

public class BlackJackTest {
	Deck deck;

	@Before
	public void setUp() throws Exception {
		deck = new Deck("poker");
	}

	@After
	public void tearDown() throws Exception {
		deck = null;
	}

	@Test
	public void test() {
		assertEquals(52, deck.getCardsInDeck().size());
		assertEquals(52, deck.getCardsRemaining());
		assertEquals(52, deck.getCardsInDeck().size());
	}

}
