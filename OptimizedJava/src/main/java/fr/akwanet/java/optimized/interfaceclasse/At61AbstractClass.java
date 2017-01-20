package fr.akwanet.java.optimized.interfaceclasse;

import fr.akwanet.java.optimized.Bowler;
import fr.akwanet.java.optimized.Circle;
import fr.akwanet.java.optimized.Golfer;
import fr.akwanet.java.optimized.MyGolfer;
import fr.akwanet.java.optimized.Team;

public abstract class At61AbstractClass {
	private Team team;
	
	public abstract int player1Score(int holeNumber, Team team);
	public abstract int player2Score(int holeNumber, Team team);
	public abstract int storeTeamScore(int score, Team team);

	public void processBetterBallTeamScores(Team team) {
		int teamScore = 0;
	}

	public static void main(String[] args) {

	}

}
