package com.example.demo.entity;

public class User {
	private String name;
	private String userName;
	private String password;
	private String id;
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", userName=" + userName + ", password=" + password + ", Id=" + id + "]";
	}
	public User(String name, String userName, String password, String id) {
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
