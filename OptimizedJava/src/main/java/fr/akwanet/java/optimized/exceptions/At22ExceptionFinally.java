package fr.akwanet.java.optimized.exceptions;

import java.awt.Point;
import java.io.IOException;

import fr.akwanet.java.optimized.User;

public class At22ExceptionFinally {
	Point p ;
	
	public int method1(){
		try {
			return 2;
		}
		catch(Exception e) {
			return 3;
		}
		finally {
			//return 4;
			System.out.println("@@@ finally method1");
		}
	}

	public int method2(){
		try {
			Point p=null;
			p.x = 0;
			
			return 3;
		}
		catch(Exception e) {
			System.out.println("*** EXCEPTION ...");
		}
		finally {
			//return 8;
			System.out.println("@@@ finally method2");
		}
		
		return 0;
	}

//	public void finalize() throws Throwable {
//		System.out.println("@@@ FINALIZE ...");
//		p = null;
//	}
	
	public synchronized void cleanup() throws IOException {
		System.out.println("cleanup ...");
	}

	public void finalize() throws Throwable
	{
		System.out.println("### finalize ...");
		try {
			cleanup();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			super.finalize();
		}
	}
	
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		//Point p = new Point(9,8);
		User u = new User("Azerty",1);
		
		System.out.println("Memory size1="+rt.freeMemory());
		At22ExceptionFinally aef = new At22ExceptionFinally();
		System.out.println("method1 renvoie "+aef.method1());
		System.out.println("method2 renvoie "+aef.method2());

		aef = null;
		u=null;
		//System.runFinalization();
		System.gc();
		//Runtime.getRuntime().runFinalization();
		rt = Runtime.getRuntime();
		
		System.out.println("Memory size2="+rt.freeMemory());

	}

}
