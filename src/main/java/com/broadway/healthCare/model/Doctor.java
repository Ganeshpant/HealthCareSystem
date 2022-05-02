package com.broadway.healthCare.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gender;
	private String email;
	private String phone;
	private String doctorId;
	private String degreeFrom;
	private String affilatedFrom;
	private String treatment;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the doctorId
	 */
	public String getDoctorId() {
		return doctorId;
	}

	/**
	 * @param doctorId the doctorId to set
	 */
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	/**
	 * @return the degreeFrom
	 */
	public String getDegreeFrom() {
		return degreeFrom;
	}

	/**
	 * @param degreeFrom the degreeFrom to set
	 */
	public void setDegreeFrom(String degreeFrom) {
		this.degreeFrom = degreeFrom;
	}

	/**
	 * @return the affilatedFrom
	 */
	public String getAffilatedFrom() {
		return affilatedFrom;
	}

	/**
	 * @param affilatedFrom the affilatedFrom to set
	 */
	public void setAffilatedFrom(String affilatedFrom) {
		this.affilatedFrom = affilatedFrom;
	}

	/**
	 * @return the treatment
	 */
	public String getTreatment() {
		return treatment;
	}

	/**
	 * @param treatment the treatment to set
	 */
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
