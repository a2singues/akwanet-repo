package fr.akwanet.java.optimized.interfaceclasse;

import java.util.Vector;

import fr.akwanet.java.optimized.User;

final class At64ConstantClassWithCloneVect {
	private int driveSize;
	private String volumeLabel;
	private Vector driveShare;
	
	private static final int sizeInMeg = 200;
	
	At64ConstantClassWithCloneVect(int size, String volLabel, Vector shareVect) {
		driveSize = size;
		volumeLabel = volLabel;
		driveShare = (Vector)shareVect.clone();
	}
	
	public int driveSize() {
		return driveSize;
	}

	public String volumeLabel() {
		return volumeLabel;
	}

	@SuppressWarnings("unchecked")
	public Vector driveShare() {
		Vector vect = new Vector(driveShare.size());
		for (int k=0; k < driveShare.size(); k++) {
			vect.add(((User)driveShare.get(k)).clone());
		}
		
		return vect;
	}

	public static void main(String[] args) {
		User share1 = new User("Duke", 10);
		User share2 = new User("Duke2", 11);
		Vector usersVect = new Vector(2);
		usersVect.add(share1);
		usersVect.add(share2);
		
		At64ConstantClassWithCloneVect accwc = new At64ConstantClassWithCloneVect(sizeInMeg, "MyDrive", usersVect);
		
		Vector shareVect = accwc.driveShare();
		System.out.println("Les utilisateurs ayant l'accès partagé sont: "+((User)shareVect.get(0)).userName()+", "+((User)shareVect.get(1)).userName());
		
		share1.setUserName("Fred");
		System.out.println("Les utilisateurs ayant l'accès partagé sont: "+((User)shareVect.get(0)).userName()+", "+((User)shareVect.get(1)).userName());
		System.out.println("L'utilisateur dans share1: "+share1.userName());
	}

}
