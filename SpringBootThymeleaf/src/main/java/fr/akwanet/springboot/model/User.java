package fr.akwanet.springboot.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;

public class User {

	@NotNull
	@Size(min = 3, max = 10)
	@Id
	private String userId;
	
	@NotNull
	@Size(min = 5, max = 20)
	private String userName;
	
	@NotNull
	private String gender;
	
	//private Boolean married;
	@Min(value=1)
	@Max(value=4)
	private short maritalStatus;

	@Max(value=0x1F)
	private short hobbies;
	 
	@NotNull
	@Email
	private String email;
	
	@Min(value=1)
	@Max(value=6)
	private String profile;

	/**
	 * Getters and setters
	 */
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public short getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(short maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public short getHobbies() {
		return hobbies;
	}

	public void setHobbies(short hobbies) {
		this.hobbies = hobbies;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "@User: userId="+userId+", userName="+userName+", gender="+gender+", maritalStatus="+maritalStatus+", Hobbies="+hobbies+", Email="+email+", profile="+profile;
	}
}
