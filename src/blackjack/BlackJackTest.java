package blackjack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import common.Deck;

public class BlackJackTest {
	Table table;

	@Before
	public void setUp() throws Exception {
		table = new Table();
	}

	@After
	public void tearDown() throws Exception {
		table = null;
	}

	@Test
	public void buildDeck() {
		assertEquals(52, table.getShoe().size());
		table.getShoe().remove(0);
		assertEquals(51, table.getShoe().size());
		assertEquals(10000.00, table.getDealer().getBank(), 0);
	}

	@Test
	public void dealCards() {
		table.dealInitialHand();
//		assertEquals(2, table.getPlayers().size());
		assertEquals(2, table.getPlayers().get(0).getHand().size());
//		assertEquals(2, table.getPlayers().get(1).getHand().size());
		assertEquals(2, table.getDealer().getHand().size());
	}

}
