package com.techouts.add;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class User {
	
    
	private String username;
	
	@NotEmpty(message = "cannot be empty")
	@Size(min=8,max=16,message = "must contain atleast 8 characters")
	private String userpassword;
	@NotEmpty
	@Email(message = "must be in the email format")
	private String useremail;
	private String gender;
	@Min(value = 18,message = "age must be greater than 18")
	@Max(value = 30,message = "age must be less than 30")
	private int age;

	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}


	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}


	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", userpassword=" + userpassword + "]";
	}
}
