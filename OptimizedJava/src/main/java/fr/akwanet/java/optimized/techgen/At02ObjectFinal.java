package fr.akwanet.java.optimized.techgen;

import fr.akwanet.java.optimized.Circle;

public class At02ObjectFinal {

	private static final Circle wheel = new Circle(5.0);
	
	public static void main(String[] args) {
		System.out.println("Le rayon de la roue est "+wheel.radius());
		wheel.setRadius(7.4);
		System.out.println("Le rayon de la roue est maintenant "+wheel.radius());

	}

}
