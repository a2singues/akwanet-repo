package fr.akwanet.java.optimized.objectegality;

import java.awt.Point;

public class At08Primitives {

	public static void main(String[]args) {
		int a = 1;
		int b = 2;
		Point x = new Point(0,0);
		Point y = new Point(1,1);
		System.out.println("a est "+a);
		System.out.println("b est "+b);
		System.out.println("x est "+x);
		System.out.println("y est "+y);
		System.out.println("Traitement des affectations et setLocation ...");
		a = b;
		a++;
		x = y ;
		x.setLocation(5, 5);
		System.out.println("a est "+a);
		System.out.println("b est "+b);
		System.out.println("x est "+x);
		System.out.println("y est "+y);
		
	}

}
