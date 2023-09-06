import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import GL.GamingLeague;

public class GamingLeagueT1 {
	GamingLeague Example1 = new GamingLeague();
	GamingLeague Example2 = new GamingLeague("LLGSMN" ,"james", 0, 0);
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testbadKdr() {
		Example2.setKdr(2.3);
		double example = Example1.calculatekdr(Example2);
		assertEquals(1, example, 0.0);
	}
	@Test
	public void testPlayerIsNotHighEnoghRank() {
		Example2.setRank(2);
	assertFalse(Example1.GamingRank(Example2));
	}

}
