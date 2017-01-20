package fr.akwanet.java.optimized.heritage;

public class Vache extends Animal {

	@Override
	public void manger() {
		System.out.println("Je broute");
	}

	@Override
	public void crier() {
		System.out.println("Je beugle");
	}

}
