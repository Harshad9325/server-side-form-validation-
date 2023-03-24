package com.usd.entity;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {

	@NotBlank(message = "user name can not be empty..!!!!")
	@Size(min = 3,max = 12,message = "user name must be 3 to 12 charactors !")
	private String name;
	@Email(regexp ="^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$",message = "invalide Email...!!!")
//	@Pattern(regexp ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "invalide Email...!!!")
	private String email;
	@AssertTrue(message = "please check the terms and conditions")
	private boolean agreed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

	public LoginData(int id, String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "user [id=" + ", name=" + name + ", email=" + email + "]";
	}

}
