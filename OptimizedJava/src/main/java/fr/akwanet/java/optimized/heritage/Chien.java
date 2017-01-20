package fr.akwanet.java.optimized.heritage;

public class Chien extends Animal {

	@Override
	public void manger() {
		System.out.println("Je croque");
	}

	@Override
	public void crier() {
		System.out.println("J'aboie");
	}

	public void opChien() {
		System.out.println("OP CHIEN");
	}
}
