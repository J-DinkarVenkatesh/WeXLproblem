package com.wexl.problem.task.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String gender;
	
	@Embedded
	private Name name;
	
	@Embedded
	private Location location;
	
	private String email;
	
	@Embedded
	private Login login;
	
	private String phone;
	private String cell;
	
	@Embedded
	private DateOfBirth dob;
	
	@Embedded
	private Registered regis;
	
	@Embedded
	private Id idDetails;
	
	@Embedded
	private Picture picture;
	
	private String nat;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCell() {
		return cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}
	public DateOfBirth getDob() {
		return dob;
	}
	public void setDob(DateOfBirth dob) {
		this.dob = dob;
	}
	public Registered getRegis() {
		return regis;
	}
	public void setRegis(Registered regis) {
		this.regis = regis;
	}
	public Id getIdDetails() {
		return idDetails;
	}
	public void setIdDetails(Id idDetails) {
		this.idDetails = idDetails;
	}
	public Picture getPicture() {
		return picture;
	}
	public void setPicture(Picture picture) {
		this.picture = picture;
	}
	public String getNat() {
		return nat;
	}
	public void setNat(String nat) {
		this.nat = nat;
	}

	public User(long id, String gender, Name name, Location location, String email, Login login,
			String phone,String cell, DateOfBirth dob, Registered regis, Id idDetails, Picture picture,
			String nat) {
		super();
		this.id = id;
		this.gender = gender;
		this.name = name;
		this.location = location;
		this.email = email;
		this.login = login;
		this.phone = phone;
		this.cell = cell;
		this.dob = dob;
		this.regis = regis;
		this.idDetails = idDetails;
		this.picture = picture;
		this.nat = nat;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", gender=" + gender + ", email=" + email + ", phone=" + phone + ", cell=" + cell
				+ ", idDetails=" + idDetails + ", nat=" + nat + "]";
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	

}
