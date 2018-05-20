package com.shirsho.contactbookproject.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Contact")
public class Contact {
	
	private long contactSequenceNumber;
	private String contactName;
	private String companyName;
	private String contactAddress;
	private String contactCity;
	private String contactState;
	private String contactEmail;
	private String contactProfileImage;
	private String birthDate;
	private String homePhone;
	private String workPhone;
	public long getContactSequenceNumber() {
		return contactSequenceNumber;
	}
	public void setContactSequenceNumber(long contactSequenceNumber) {
		this.contactSequenceNumber = contactSequenceNumber;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String getContactCity() {
		return contactCity;
	}
	public void setContactCity(String contactCity) {
		this.contactCity = contactCity;
	}
	public String getContactState() {
		return contactState;
	}
	public void setContactState(String contactState) {
		this.contactState = contactState;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactProfileImage() {
		return contactProfileImage;
	}
	public void setContactProfileImage(String contactProfileImage) {
		this.contactProfileImage = contactProfileImage;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	

}
