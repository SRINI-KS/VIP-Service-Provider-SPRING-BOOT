package com.Vip.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="UserDetails")
public class UserRegisterationModel {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "Id")
	    private int id;
	    @Column(name = "userFname")
	    private  String userFname;
	    @Column(name = "userLname")
	    private  String userLname;
	    @Column(name = "email")
	    private  String email;
	    @Column(name = "password")
	    private  String password;
	    @Column(name = "phoneNumber")
	    private  String phoneNumber;
	    @Column(name = "gender")
	    private  String gender;
	    @Column(name = "aadharNum")
	    private  String aadharNum;
	    @Column(name = "panNum")
	    private  String panNum;
	    @Column(name = "address")
	    private  String address;
	    @Column(name = "city")
	    private  String city;
	    @Column(name = "state")
	    private  String state;
	    @Column(name = "postalCode")
	    private  String postalCode;
	    @Column(name = "category")
	    private  String category;
	    @Column(name = "country")
	    private  String country;
	    
		public UserRegisterationModel() {
			super();
			// TODO Auto-generated constructor stub
		}

		public UserRegisterationModel(String userFname, String userLname, String email, String password,
				String phoneNumber, String gender, String aadharNum, String panNum, String address, String city,
				String state, String postalCode, String category, String country) {
			super();
			this.userFname = userFname;
			this.userLname = userLname;
			this.email = email;
			this.password = password;
			this.phoneNumber = phoneNumber;
			this.gender = gender;
			this.aadharNum = aadharNum;
			this.panNum = panNum;
			this.address = address;
			this.city = city;
			this.state = state;
			this.postalCode = postalCode;
			this.category = category;
			this.country = country;
		}

		public String getUserFname() {
			return userFname;
		}

		public void setUserFname(String userFname) {
			this.userFname = userFname;
		}

		public String getUserLname() {
			return userLname;
		}

		public void setUserLname(String userLname) {
			this.userLname = userLname;
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

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getAadharNum() {
			return aadharNum;
		}

		public void setAadharNum(String aadharNum) {
			this.aadharNum = aadharNum;
		}

		public String getPanNum() {
			return panNum;
		}

		public void setPanNum(String panNum) {
			this.panNum = panNum;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getPostalCode() {
			return postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		@Override
		public String toString() {
			return "UserRegisterationModel [id=" + id + ", userFname=" + userFname + ", userLname=" + userLname
					+ ", email=" + email + ", password=" + password + ", phoneNumber=" + phoneNumber + ", gender="
					+ gender + ", aadharNum=" + aadharNum + ", panNum=" + panNum + ", address=" + address + ", city="
					+ city + ", state=" + state + ", postalCode=" + postalCode + ", category=" + category + ", country="
					+ country + "]";
		}
		
		
		
		
	    
	    

}
