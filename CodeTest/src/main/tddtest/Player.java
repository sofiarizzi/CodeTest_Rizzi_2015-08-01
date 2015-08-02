package main.tddtest;

public class Player {
	
	/** points for each player **/
	private int score;
	
	/** player identifier **/
	private String name;
	
	public Player(String name){
		this.score = 0;
		this.name = name;
	}
	
	public Player(int score, String name){
		this.score = score;
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScoreResult(){
		if (score == 0){
			return "love";
		} else if (score == 1){
			return "fifteen";
		} else if (score == 2){
			return "thirty";
		} else if (score == 3){
			return "forty";
		} 
		return "";
	}
	
}
