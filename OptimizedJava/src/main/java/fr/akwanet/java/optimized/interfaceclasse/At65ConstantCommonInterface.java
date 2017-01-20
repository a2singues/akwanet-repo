package fr.akwanet.java.optimized.interfaceclasse;

import fr.akwanet.java.optimized.ImmutablePinNumbers;
import fr.akwanet.java.optimized.MutablePinNumbers;

class At65ConstantCommonInterface {
	
	public void foo(MutablePinNumbers mpn) {
	}
	
	public void bar(ImmutablePinNumbers mpn) {
	}
	public static void main(String[] args) {
		At65ConstantCommonInterface acci = new At65ConstantCommonInterface();
		
		MutablePinNumbers mpn = new MutablePinNumbers("personnel1", 101, 201);
		
		ImmutablePinNumbers impn = new ImmutablePinNumbers("personnel2", 102, 202);
		
//		foo((MutablePinNumbers)impn);
//		bar((ImmutablePinNumbers)mpn);
		System.out.println("Mutable: "+mpn+", Immutable: "+impn);
		
	}

}
