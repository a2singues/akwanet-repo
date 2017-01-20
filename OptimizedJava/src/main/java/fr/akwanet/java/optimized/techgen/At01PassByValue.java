package fr.akwanet.java.optimized.techgen;

import java.awt.Point;


public class At01PassByValue {

	public static void modifyPoint(Point pt, int j) {
		pt.setLocation(5, 7);
		j = 15;
		System.out.println("Pendant modifyPoint "+"pt = "+pt+" et j="+j);
	}
	
	public static void main(String[] args) {
		Point p = new Point(0, 0);
		int i = 10;
		
		System.out.println("Avant modifyPoint "+"p = "+p+" et i="+i);
		modifyPoint(p, i);
		System.out.println("Après modifyPoint "+"p = "+p+" et i="+i);

	}

}
