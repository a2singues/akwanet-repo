package fr.akwanet.java.optimized;


public class ImmutablePinNumbers implements PinNumbers{
	
	private String acctOwner;
	private int checkingAcctPin;
	private int savingAcctPin;
	
	public ImmutablePinNumbers(String owner, int cPin, int sPin) {
		acctOwner = owner;
		checkingAcctPin = cPin;
		savingAcctPin = sPin;
	}

	@Override
	public String accountOwner() {
		return acctOwner;
	}


	@Override
	public int checkingPin() {
		return checkingAcctPin;
	}


	@Override
	public int savingPin() {
		return savingAcctPin;
	}

}
