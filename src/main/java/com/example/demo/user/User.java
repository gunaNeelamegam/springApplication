package com.example.demo.user;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Component
@Entity
public class User {
	@Id
	private String username;
	private String password;
	private long mobileNumber;

	public String getUsername() {
		return username;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", mobileNumber=" + mobileNumber + "]";
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
