import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import GL.GamingLeague;

public class GamingLeagueT2 {
	String Team = "LLGSMN";
	GamingLeague GLeague = new GamingLeague(Team,"James",0,0);
	String Player = "James";
	GamingLeague GamingL = new GamingLeague("LLGSMN",Player,0,0);
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertSame(Team, GLeague.printTeam());
		}
	@Test
	public void testPlayerNameNotNull() {
		assertNotNull(GamingL.printPlayerName( ));
		}

}
