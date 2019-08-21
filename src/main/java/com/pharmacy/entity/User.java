package com.pharmacy.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "users")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "user_id", unique = true)
	private int id;
	/*
	@Column(name = "person_id")
	private int personId;

	@Column(name = "role_id")
	private int roleId;

	@Column(name = "pharmacy_id")
	private int pharmacyId;*/

	@Column(name = "login")
	private String login;

	@Column(name = "password")
	private String password;

	@ManyToOne
	@JoinColumn(name = "person_id", referencedColumnName = "person_id")
	private Person person;
	
	@ManyToOne
	@JoinColumn(name = "role_id", referencedColumnName = "role_id")
	private Role role;
	
	@ManyToOne
	@JoinColumn(name = "pharmacy_id", referencedColumnName = "pharmacy_id")
	private Pharmacy pharmacy;

	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
/*
	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getPharmacyId() {
		return pharmacyId;
	}

	public void setPharmacyId(int pharmacyId) {
		this.pharmacyId = pharmacyId;
	}
*/
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Pharmacy getPharmacy() {
		return pharmacy;
	}

	public void setPharmacy(Pharmacy pharmacy) {
		this.pharmacy = pharmacy;
	};

}
