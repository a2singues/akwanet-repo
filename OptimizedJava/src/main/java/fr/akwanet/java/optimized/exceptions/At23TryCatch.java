package fr.akwanet.java.optimized.exceptions;

public class At23TryCatch {
	
	public void method1(int size){
		int[] ia = new int[size];
		
		try {
			for (int k=0; k < size; k++) {
				ia[k] = k;
			}
		}
		catch(Exception e) {
		}
	}

	public void method2(int size){
		int[] ia = new int[size];
		
		for (int k=0; k < size; k++) {
			try {
					ia[k] = k;
			}
			catch(Exception e) {
			}
		}
	}
}
