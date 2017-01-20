package fr.akwanet.java.optimized.interfaceclasse;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;

import fr.akwanet.java.optimized.User;

final class At67FinalizeMethod {
	private ServerSocket ss;
	private FileInputStream fis;
	private User driveShare;
	
	public synchronized void cleanup() throws IOException {
		System.out.println("cleanup ...");
		if (ss != null) {
			ss.close();
			ss = null;
		}
		
		if (fis != null) {
			fis.close();
			fis = null;
		}
	}
	
	public void finalize() throws Throwable
	{
		System.out.println("finalize ...");
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
		
		At67FinalizeMethod afm = new At67FinalizeMethod();
		System.out.println("Objet créé: "+afm);
		afm = null;
		System.runFinalization();
		System.gc();
		Runtime.getRuntime().runFinalization();
		At67FinalizeMethod afm1 = new At67FinalizeMethod();
		try {
			//afm1.wait(5000);
			Thread.sleep(20000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("@@@ C'est fini !!!");
	}

}
