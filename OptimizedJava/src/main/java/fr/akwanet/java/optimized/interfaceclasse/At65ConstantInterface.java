package fr.akwanet.java.optimized.interfaceclasse;

import java.util.Vector;

import fr.akwanet.java.optimized.ImmutableCircle;
import fr.akwanet.java.optimized.MutableCircle;
import fr.akwanet.java.optimized.User;

final class At65ConstantInterface {
	public ImmutableCircle createWheel(double r) {
		return new MutableCircle(r);
	}
	
	public static void main(String[] args) {
		At65ConstantInterface aci = new At65ConstantInterface();
		
		ImmutableCircle iWheel = aci.createWheel(5.0);
		
		System.out.println("Le rayon de la roue est: "+iWheel.radius());
		
		//((MutableCircle)iWheel).setRadius(7.4);
		//System.out.println("Le rayon de la roue est maintenant: "+iWheel.radius());
		
	}

}
