package com.rt.Entityes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "spring_boot")
public class Entityes {

	@Id
	@GeneratedValue
	@Column(name = "id")
	
	@NotNull(message = "Id is Required")
	private int id;

	@Size(max = 6, message = "plz Enter Your Proper Name.?")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Invalid name format. Should only contain letters and spaces.")
	@Column(name = "name")
	private String name;
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Invalid name format. Should only contain letters and spaces.")
	@Column(name = "lastname")
	private String lastname;

	@Size(min = 10, max = 12, message = "plz Enter Your Proper Number.?")
	@Column(name = "mobile")
	private String mobile;

	@Column(name = "address")
	private String address;

	public Entityes() {
	}

	public Entityes(int id, String name, String lastname, String mobile, String address) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.mobile = mobile;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
