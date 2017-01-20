package fr.akwanet.java.optimized.interfaceclasse;

import fr.akwanet.java.optimized.User;

final class At64ConstantClassWithClone {
	private int driveSize;
	private String volumeLabel;
	private User driveShare;
	
	private static final int sizeInMeg = 200;
	
	At64ConstantClassWithClone(int size, String volLabel, User share) {
		driveSize = size;
		volumeLabel = volLabel;
		driveShare = (User)share.clone();
	}
	
	public int driveSize() {
		return driveSize;
	}

	public String volumeLabel() {
		return volumeLabel;
	}

	public User driveShare() {
		User cloned = (User)driveShare.clone();
		System.out.println("This="+driveShare+", cloned="+cloned);
		System.out.println("This="+driveShare.userName()+", cloned="+cloned.userName());
		return cloned;
	}

	public static void main(String[] args) {
		User share1 = new User("Duke", 10);
		At64ConstantClassWithClone accwc = new At64ConstantClassWithClone(sizeInMeg, "MyDrive", share1);
		
		User share = accwc.driveShare();
		System.out.println("@@@ share="+share);
		System.out.println("Utilisateur ayant l'accès partagé est "+share.userName());
		
		share1.setUserName("Fred");
		System.out.println("@@@ share1="+share.userName());
		System.out.println("Utilisateur ayant l'accès partagé est "+share.userName());
	}

}
