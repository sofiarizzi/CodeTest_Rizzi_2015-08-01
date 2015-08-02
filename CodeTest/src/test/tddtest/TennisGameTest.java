package test.tddtest;

import main.tddtest.Player;
import main.tddtest.TennisGame;
import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest {

	Player player1 = new Player("player1");
	Player player2 = new Player("player2");
	//
	// Scores from zero to three points are described as “love”, “fifteen”, “thirty”, and “forty” respectively.
	//
	@Test
	public final void whenScoreIsZeroThenResultDescriptionIsLove(){
		player1.setScore(0);
		player2.setScore(0);
		Assert.assertEquals("love-love", TennisGame.playGame(player1, player2));
	}
	
	@Test
	public final void whenScoreIsOneResultDescriptionIsFifTeen(){
		player1.setScore(1);
		player2.setScore(1);
		Assert.assertEquals("fifteen-fifteen", TennisGame.playGame(player1, player2));
	}
	
	@Test
	public final void whenScoreIsTwoResultDescriptionIsThirty(){
		player1.setScore(2);
		player2.setScore(2);
		Assert.assertEquals("thirty-thirty", TennisGame.playGame(player1, player2));
	}
	
	@Test
	public final void whenScoreIsThreeResultDescriptionIsForty(){
		player1.setScore(2);
		player2.setScore(3);
		Assert.assertEquals("thirty-forty", TennisGame.playGame(player1, player2));
	}
	
	@Test
	public final void whenScoreForEachPlayerIsAtLeastThreeAndScoresAreEqualsThenResultDescriptionIsForty(){
		player1.setScore(3);
		player2.setScore(3);
		Assert.assertEquals("deuce", TennisGame.playGame(player1, player2));
	}
	
	
	@Test
	public final void whenScoreIsAtLeastThreeByEachSideButOnePlayerHasOneMorePointThenThereIsAdvantage(){
		player1.setScore(3);
		player2.setScore(4);
		Assert.assertEquals("player2 advantage", TennisGame.playGame(player1, player2));
	}
	
	@Test
	public final void whenScoreIsAtLeastThreeByEachSideButOnePlayerHasTwoMorePointThenThereIsAdvantage(){
		player1.setScore(3);
		player2.setScore(5);
		Assert.assertEquals("player2 winner", TennisGame.playGame(player1, player2));
	}

}
