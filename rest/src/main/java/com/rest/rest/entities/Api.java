package com.rest.rest.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "api")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})

public class Api {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cuid;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="voterid")
	private String voterid;
	
	@Column(name="policyno")
	private String policyno;
	
	@Column(name="drivinglicence")
	private String drivinglicence;
	
	@Column(name="passport")
	private String passport;
	
	@Column(name="emails")
	private String emails;
	
	@Column(name="contantnum")
	private String contactNo;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="middlename")
	private String middlename;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="ffirstname")
	private String ffirstname;
	
	@Column(name="fmiddlename")
	private String fmiddlename;
	
	@Column(name="flastname")
	private String flastname;
	
	

	@Column(name="accountnumber")
	private String accountNumber;
	
	@Column(name="ifsccode")
	private String ifsccode;
	
	@Column(name="addresstype")
	private String addressType;
	
	@Column(name="addressline1")
	private String addressline1;
	
	@Column(name="addressline2")
	private String addressline2;
	
	@Column(name="addressline3")
	private String addressline3;
	
	@Column(name="city")
	private String city;
	
	@Column(name="pincode")
	private String pincode;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;

	public Api(int cuid, String dob, String gender, String voterid, String policyno, String drivinglicence,
			String passport, String emails, String contactNo, String firstname, String middlename, String lastname,
			String ffirstname, String fmiddlename, String flastname, String accountNumber, String ifsccode,
			String addressType, String addressline1, String addressline2, String addressline3, String city,
			String pincode, String state, String country) {
		super();
		this.cuid = cuid;
		this.dob = dob;
		this.gender = gender;
		this.voterid = voterid;
		this.policyno = policyno;
		this.drivinglicence = drivinglicence;
		this.passport = passport;
		this.emails = emails;
		this.contactNo = contactNo;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.ffirstname = ffirstname;
		this.fmiddlename = fmiddlename;
		this.flastname = flastname;
		this.accountNumber = accountNumber;
		this.ifsccode = ifsccode;
		this.addressType = addressType;
		this.addressline1 = addressline1;
		this.addressline2 = addressline2;
		this.addressline3 = addressline3;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}

	public Api() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getCuid() {
		return cuid;
	}

	public void setCuid(int cuid) {
		this.cuid = cuid;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getVoterid() {
		return voterid;
	}

	public void setVoterid(String voterid) {
		this.voterid = voterid;
	}

	
	public String getPolicyno() {
		return policyno;
	}

	public void setPolicyno(String policyno) {
		this.policyno = policyno;
	}

	public String getDrivinglicence() {
		return drivinglicence;
	}

	public void setDrivinglicence(String drivinglicence) {
		this.drivinglicence = drivinglicence;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getEmails() {
		return emails;
	}

	public void setEmails(String emails) {
		this.emails = emails;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFfirstname() {
		return ffirstname;
	}

	public void setFfirstname(String ffirstname) {
		this.ffirstname = ffirstname;
	}

	public String getFmiddlename() {
		return fmiddlename;
	}

	public void setFmiddlename(String fmiddlename) {
		this.fmiddlename = fmiddlename;
	}

	public String getFlastname() {
		return flastname;
	}

	public void setFlastname(String flastname) {
		this.flastname = flastname;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getAddressline3() {
		return addressline3;
	}

	public void setAddressline3(String addressline3) {
		this.addressline3 = addressline3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	@Override
	public String toString() {
		return "Api [cuid=" + cuid + ", dob=" + dob + ", gender=" + gender + ", voterid=" + voterid + ", policyno="
				+ policyno + ", drivinglicence=" + drivinglicence + ", passport=" + passport + ", emails=" + emails
				+ ", contactNo=" + contactNo + ", firstname=" + firstname + ", middlename=" + middlename + ", lastname="
				+ lastname + ", ffirstname=" + ffirstname + ", fmiddlename=" + fmiddlename + ", flastname=" + flastname
				+ ", accountNumber=" + accountNumber + ", ifsccode=" + ifsccode + ", addressType=" + addressType
				+ ", addressline1=" + addressline1 + ", addressline2=" + addressline2 + ", addressline3=" + addressline3
				+ ", city=" + city + ", pincode=" + pincode + ", state=" + state + ", country=" + country
				+ ", getCuid()=" + getCuid() + ", getDob()=" + getDob() + ", getGender()=" + getGender()
				+ ", getVoterid()=" + getVoterid() + ", getPolicyno()=" + getPolicyno() + ", getDrivinglicence()="
				+ getDrivinglicence() + ", getPassport()=" + getPassport() + ", getEmails()=" + getEmails()
				+ ", getContactNo()=" + getContactNo() + ", getFirstname()=" + getFirstname() + ", getMiddlename()="
				+ getMiddlename() + ", getLastname()=" + getLastname() + ", getFfirstname()=" + getFfirstname()
				+ ", getFmiddlename()=" + getFmiddlename() + ", getFlastname()=" + getFlastname()
				+ ", getAccountNumber()=" + getAccountNumber() + ", getIfsccode()=" + getIfsccode()
				+ ", getAddressType()=" + getAddressType() + ", getAddressline1()=" + getAddressline1()
				+ ", getAddressline2()=" + getAddressline2() + ", getAddressline3()=" + getAddressline3()
				+ ", getCity()=" + getCity() + ", getPincode()=" + getPincode() + ", getState()=" + getState()
				+ ", getCountry()=" + getCountry() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}






















//package com.rest.rest.entities;
//
//import javax.persistence.*;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//@Entity
//@Table(name = "Courses")
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
//
//public class Course {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int id;
//	
//	@Column(name="title")
//	private String title;
//	
//	@Column(name="description")
//	private String description;
//	
//	
//	public Course(int id, String title, String description) {
//		super();
//		this.id = id;
//		this.title = title;
//		this.description = description;
//	}
//	
//	
//	public Course() {
//		super();
//	}
//
//
//	public long getId() {
//		return id;
//	}
//
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//
//	public String getTitle() {
//		return title;
//	}
//
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//
//	public String getDescription() {
//		return description;
//	}
//
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Course [id=" + id + ", title=" + title + ", description=" + description + ", getId()=" + getId()
//				+ ", getTitle()=" + getTitle() + ", getDescription()=" + getDescription() + ", getClass()=" + getClass()
//				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//	}
//
//}
