package fr.akwanet.java.optimized;


public class MutablePinNumbers implements PinNumbers{
	
	private String acctOwner;
	private int checkingAcctPin;
	private int savingAcctPin;
	
	public MutablePinNumbers(String owner, int cPin, int sPin) {
		acctOwner = owner;
		checkingAcctPin = cPin;
		savingAcctPin = sPin;
	}
	
	
	public void setAcctOwner(String acctOwner) {
		this.acctOwner = acctOwner;
	}


	public void setCheckingAcctPin(int checkingAcctPin) {
		this.checkingAcctPin = checkingAcctPin;
	}


	public void setSavingAcctPin(int savingAcctPin) {
		this.savingAcctPin = savingAcctPin;
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
