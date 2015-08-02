package main.tddtest;

public class TennisGame {
	
	public static String playGame(Player player1, Player player2){
		
		// same score 
		if (player1.getScore() == player2.getScore()){
			if ((player1.getScore() >=3) && (player2.getScore() >=3)){
				return "deuce";
			}
		} else {
			
			// different scores
			if (player1.getScore()>=3 && player2.getScore()>=3){
				
				int margin = player1.getScore() - player2.getScore();
				
				Player leader = margin > 0 ? player1 : player2;
				
				margin = Math.abs(margin);
						
				if (margin == 1){
					return leader.getName() + " advantage";
				
				} else {
					// maybe there is a winner
					if (margin == 2 && leader.getScore() >=4){
						return leader.getName() + " winner";
					}
				}
			} 
		}
		// in all other cases 
		return player1.getScoreResult() +"-"+player2.getScoreResult();
	}
}
