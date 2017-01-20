package fr.akwanet.java.optimized;

public class User implements Cloneable {
	private String userName;
	private String userID;
	private int userNode;
	
	public User(String name, int node) {
		userName = name;
		userNode = node;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public void setUserNode(int userNode) {
		this.userNode = userNode;
	}
	
	public String userName() {
		return userName;
	}
	
	public Object clone() {
		try {
			return super.clone();
		}
		catch(Exception e) {
			throw new InternalError();
		}
	}
	public void finalize() throws Throwable
	{
		System.out.println("### finalize USER ...");
	}

}
