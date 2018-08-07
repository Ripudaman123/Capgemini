package com.cg.MyServelet;

import java.time.LocalDate;
import java.util.Arrays;

public class Resume {

	private String firstName;
	private String lastName;
	private String gender;
	private String highestQualification;
	private String dob;
	private String Address;
	private String skills[]=new String[4];
	private String email;
	private String website;
	private String contactNo;
	private String summary;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String string) {
		this.dob = string;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Resume [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", highestQualification=" + highestQualification + ", dob=" + dob + ", Address=" + Address
				+ ", skills=" + Arrays.toString(skills) + ", email=" + email + ", website=" + website + ", contactNo="
				+ contactNo + ", summary=" + summary + "]";
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	
	
}
