package com.projectwall.pojos;

public class User {
	
	private Long id ;
	private String name ;
	private Integer contact ;
	private String email ;
	private String password ;
	private enum  role
	{
	    ADMIN, USER, MANAGER;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(long id, String name, Integer contact, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getContact() {
		return contact;
	}

	public void setContact(Integer contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + ", email=" + email + ", password="
				+ password + "]";
	}
	
	

	
	

}
