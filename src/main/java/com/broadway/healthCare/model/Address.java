package com.broadway.healthCare.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String country;
	private String state;
	private String zone;
	private String district;
	private String zip;
	private String municipality;
	private String wardNo;
	private String tole;
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
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zone
	 */
	public String getZone() {
		return zone;
	}
	/**
	 * @param zone the zone to set
	 */
	public void setZone(String zone) {
		this.zone = zone;
	}
	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}
	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	/**
	 * @return the municipality
	 */
	public String getMunicipality() {
		return municipality;
	}
	/**
	 * @param municipality the municipality to set
	 */
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}
	/**
	 * @return the wardNo
	 */
	public String getWardNo() {
		return wardNo;
	}
	/**
	 * @param wardNo the wardNo to set
	 */
	public void setWardNo(String wardNo) {
		this.wardNo = wardNo;
	}
	/**
	 * @return the tole
	 */
	public String getTole() {
		return tole;
	}
	/**
	 * @param tole the tole to set
	 */
	public void setTole(String tole) {
		this.tole = tole;
	}
	
	
}
