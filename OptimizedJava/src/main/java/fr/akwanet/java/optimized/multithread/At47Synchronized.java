package fr.akwanet.java.optimized.multithread;

public class At47Synchronized extends Thread {

	public void printM1() {
		synchronized(At47Synchronized.class) {
			while (true)
				System.out.println("Print M1");
		}
	}

	public synchronized static void printM2() {
		while (true)
			System.out.println("Print M2");
	}

	public void run() {
		printM1();
	}
	
	public static void main(String[] args) {
		At47Synchronized f = new At47Synchronized();
		//Thread th = new Thread(f);
		f.start();
		f.printM2();
	}

}
