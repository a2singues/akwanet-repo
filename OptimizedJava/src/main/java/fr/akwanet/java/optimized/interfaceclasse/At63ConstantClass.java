package fr.akwanet.java.optimized.interfaceclasse;

import fr.akwanet.java.optimized.Bowler;
import fr.akwanet.java.optimized.Circle;
import fr.akwanet.java.optimized.Golfer;
import fr.akwanet.java.optimized.MyGolfer;
import fr.akwanet.java.optimized.Team;

final class At63ConstantClass {
	private String acctOwner;
	private int checkingAcctPin;
	private int savingAcctPin;
	
	At63ConstantClass(String owner, int cPin, int sPin) {
		acctOwner = owner;
		checkingAcctPin = cPin;
		savingAcctPin = sPin;
	}
	
	public String accountOwner() {
		return acctOwner;
	}

	public int checkingPin() {
		return checkingAcctPin;
	}

	public int savingingPin() {
		return savingAcctPin;
	}

	public static void main(String[] args) {

	}

}
